package com.example.lab3mobile.ui.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import com.example.lab3mobile.R
import com.example.lab3mobile.TipsApplication
import com.example.lab3mobile.data.Tip
import com.example.lab3mobile.databinding.ActivityTipDetailBinding

/**
 * Экран совета: большая иллюстрация и полный текст.
 */
class TipDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTipDetailBinding

    private val viewModel: TipDetailViewModel by viewModels {
        TipDetailViewModelFactory(
            (application as TipsApplication).repository,
            intent.getIntExtra(EXTRA_TIP_DAY, FIRST_DAY)
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTipDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        applyWindowInsets()
        binding.toolbar.setNavigationOnClickListener { finish() }

        viewModel.tip.observe(this) { tip ->
            if (tip == null) finish() else showTip(tip)
        }
    }

    private fun showTip(tip: Tip) {
        binding.toolbar.title = getString(R.string.tip_detail_title, tip.day)
        binding.tipImage.setImageResource(tip.imageRes)
        binding.tipTitle.setText(tip.titleRes)
        binding.tipSummary.setText(tip.summaryRes)
        binding.tipDescription.setText(tip.descriptionRes)
    }

    private fun applyWindowInsets() {
        val contentBottom = binding.content.paddingBottom
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, insets ->
            val bars = insets.getInsets(
                WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout()
            )
            binding.appBar.updatePadding(top = bars.top, left = bars.left, right = bars.right)
            binding.content.updatePadding(bottom = contentBottom + bars.bottom)
            binding.scroll.updatePadding(left = bars.left, right = bars.right)
            insets
        }
    }

    companion object {
        private const val EXTRA_TIP_DAY = "com.example.lab3mobile.extra.TIP_DAY"
        private const val FIRST_DAY = 1

        fun newIntent(context: Context, day: Int): Intent =
            Intent(context, TipDetailActivity::class.java).putExtra(EXTRA_TIP_DAY, day)
    }
}
