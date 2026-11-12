package com.example.lab3mobile

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import androidx.recyclerview.widget.GridLayoutManager
import com.example.lab3mobile.data.Tip
import com.example.lab3mobile.databinding.ActivityMainBinding
import com.example.lab3mobile.ui.detail.TipDetailActivity
import com.example.lab3mobile.ui.list.TipsAdapter
import com.example.lab3mobile.ui.list.TipsViewModel
import com.example.lab3mobile.ui.list.TipsViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel: TipsViewModel by viewModels {
        TipsViewModelFactory(application as TipsApplication)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        applyWindowInsets()

        // на телефоне — один столбец, в альбомной ориентации и на планшете — сетка
        binding.tipsList.layoutManager =
            GridLayoutManager(this, resources.getInteger(R.integer.tips_span_count))
        binding.tipsList.setHasFixedSize(true)

        viewModel.tips.observe(this) { tips ->
            binding.tipsList.adapter = TipsAdapter(tips) { tip -> openTip(tip) }
        }
    }

    private fun openTip(tip: Tip) {
        startActivity(TipDetailActivity.newIntent(this, tip.day))
    }

    private fun applyWindowInsets() {
        // отступы списка из разметки сохраняем: системные добавляются к ним, а не заменяют их
        val listLeft = binding.tipsList.paddingLeft
        val listRight = binding.tipsList.paddingRight
        val listBottom = binding.tipsList.paddingBottom
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { _, insets ->
            val bars = insets.getInsets(
                WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout()
            )
            binding.appBar.updatePadding(top = bars.top, left = bars.left, right = bars.right)
            binding.tipsList.updatePadding(
                left = listLeft + bars.left,
                right = listRight + bars.right,
                bottom = listBottom + bars.bottom
            )
            insets
        }
    }
}
