package com.example.lab3mobile.data

import com.example.lab3mobile.R

/**
 * Тридцать советов, по одному на каждый день месяца. Тексты — в strings.xml,
 * картинки — в drawable-xhdpi, здесь только идентификаторы ресурсов.
 */
object TipsDataSource {

    fun loadTips(): List<Tip> = listOf(
        Tip(
            day = 1,
            titleRes = R.string.tip_1_title,
            summaryRes = R.string.tip_1_summary,
            descriptionRes = R.string.tip_1_description,
            imageRes = R.drawable.tip_day_01
        ),
        Tip(
            day = 2,
            titleRes = R.string.tip_2_title,
            summaryRes = R.string.tip_2_summary,
            descriptionRes = R.string.tip_2_description,
            imageRes = R.drawable.tip_day_02
        ),
        Tip(
            day = 3,
            titleRes = R.string.tip_3_title,
            summaryRes = R.string.tip_3_summary,
            descriptionRes = R.string.tip_3_description,
            imageRes = R.drawable.tip_day_03
        ),
        Tip(
            day = 4,
            titleRes = R.string.tip_4_title,
            summaryRes = R.string.tip_4_summary,
            descriptionRes = R.string.tip_4_description,
            imageRes = R.drawable.tip_day_04
        ),
        Tip(
            day = 5,
            titleRes = R.string.tip_5_title,
            summaryRes = R.string.tip_5_summary,
            descriptionRes = R.string.tip_5_description,
            imageRes = R.drawable.tip_day_05
        ),
        Tip(
            day = 6,
            titleRes = R.string.tip_6_title,
            summaryRes = R.string.tip_6_summary,
            descriptionRes = R.string.tip_6_description,
            imageRes = R.drawable.tip_day_06
        ),
        Tip(
            day = 7,
            titleRes = R.string.tip_7_title,
            summaryRes = R.string.tip_7_summary,
            descriptionRes = R.string.tip_7_description,
            imageRes = R.drawable.tip_day_07
        ),
        Tip(
            day = 8,
            titleRes = R.string.tip_8_title,
            summaryRes = R.string.tip_8_summary,
            descriptionRes = R.string.tip_8_description,
            imageRes = R.drawable.tip_day_08
        ),
        Tip(
            day = 9,
            titleRes = R.string.tip_9_title,
            summaryRes = R.string.tip_9_summary,
            descriptionRes = R.string.tip_9_description,
            imageRes = R.drawable.tip_day_09
        ),
        Tip(
            day = 10,
            titleRes = R.string.tip_10_title,
            summaryRes = R.string.tip_10_summary,
            descriptionRes = R.string.tip_10_description,
            imageRes = R.drawable.tip_day_10
        ),
        Tip(
            day = 11,
            titleRes = R.string.tip_11_title,
            summaryRes = R.string.tip_11_summary,
            descriptionRes = R.string.tip_11_description,
            imageRes = R.drawable.tip_day_11
        ),
        Tip(
            day = 12,
            titleRes = R.string.tip_12_title,
            summaryRes = R.string.tip_12_summary,
            descriptionRes = R.string.tip_12_description,
            imageRes = R.drawable.tip_day_12
        ),
        Tip(
            day = 13,
            titleRes = R.string.tip_13_title,
            summaryRes = R.string.tip_13_summary,
            descriptionRes = R.string.tip_13_description,
            imageRes = R.drawable.tip_day_13
        ),
        Tip(
            day = 14,
            titleRes = R.string.tip_14_title,
            summaryRes = R.string.tip_14_summary,
            descriptionRes = R.string.tip_14_description,
            imageRes = R.drawable.tip_day_14
        ),
        Tip(
            day = 15,
            titleRes = R.string.tip_15_title,
            summaryRes = R.string.tip_15_summary,
            descriptionRes = R.string.tip_15_description,
            imageRes = R.drawable.tip_day_15
        ),
        Tip(
            day = 16,
            titleRes = R.string.tip_16_title,
            summaryRes = R.string.tip_16_summary,
            descriptionRes = R.string.tip_16_description,
            imageRes = R.drawable.tip_day_16
        ),
        Tip(
            day = 17,
            titleRes = R.string.tip_17_title,
            summaryRes = R.string.tip_17_summary,
            descriptionRes = R.string.tip_17_description,
            imageRes = R.drawable.tip_day_17
        ),
        Tip(
            day = 18,
            titleRes = R.string.tip_18_title,
            summaryRes = R.string.tip_18_summary,
            descriptionRes = R.string.tip_18_description,
            imageRes = R.drawable.tip_day_18
        ),
        Tip(
            day = 19,
            titleRes = R.string.tip_19_title,
            summaryRes = R.string.tip_19_summary,
            descriptionRes = R.string.tip_19_description,
            imageRes = R.drawable.tip_day_19
        ),
        Tip(
            day = 20,
            titleRes = R.string.tip_20_title,
            summaryRes = R.string.tip_20_summary,
            descriptionRes = R.string.tip_20_description,
            imageRes = R.drawable.tip_day_20
        ),
        Tip(
            day = 21,
            titleRes = R.string.tip_21_title,
            summaryRes = R.string.tip_21_summary,
            descriptionRes = R.string.tip_21_description,
            imageRes = R.drawable.tip_day_21
        ),
        Tip(
            day = 22,
            titleRes = R.string.tip_22_title,
            summaryRes = R.string.tip_22_summary,
            descriptionRes = R.string.tip_22_description,
            imageRes = R.drawable.tip_day_22
        ),
        Tip(
            day = 23,
            titleRes = R.string.tip_23_title,
            summaryRes = R.string.tip_23_summary,
            descriptionRes = R.string.tip_23_description,
            imageRes = R.drawable.tip_day_23
        ),
        Tip(
            day = 24,
            titleRes = R.string.tip_24_title,
            summaryRes = R.string.tip_24_summary,
            descriptionRes = R.string.tip_24_description,
            imageRes = R.drawable.tip_day_24
        ),
        Tip(
            day = 25,
            titleRes = R.string.tip_25_title,
            summaryRes = R.string.tip_25_summary,
            descriptionRes = R.string.tip_25_description,
            imageRes = R.drawable.tip_day_25
        ),
        Tip(
            day = 26,
            titleRes = R.string.tip_26_title,
            summaryRes = R.string.tip_26_summary,
            descriptionRes = R.string.tip_26_description,
            imageRes = R.drawable.tip_day_26
        ),
        Tip(
            day = 27,
            titleRes = R.string.tip_27_title,
            summaryRes = R.string.tip_27_summary,
            descriptionRes = R.string.tip_27_description,
            imageRes = R.drawable.tip_day_27
        ),
        Tip(
            day = 28,
            titleRes = R.string.tip_28_title,
            summaryRes = R.string.tip_28_summary,
            descriptionRes = R.string.tip_28_description,
            imageRes = R.drawable.tip_day_28
        ),
        Tip(
            day = 29,
            titleRes = R.string.tip_29_title,
            summaryRes = R.string.tip_29_summary,
            descriptionRes = R.string.tip_29_description,
            imageRes = R.drawable.tip_day_29
        ),
        Tip(
            day = 30,
            titleRes = R.string.tip_30_title,
            summaryRes = R.string.tip_30_summary,
            descriptionRes = R.string.tip_30_description,
            imageRes = R.drawable.tip_day_30
        )
    )
}
