package com.example.myapplication

object FilipinoQuestionRepository{
    fun getQuestion(): ArrayList<DataClassQuestionAnswer>{
        val questionList = ArrayList<DataClassQuestionAnswer>()
        // 1
        val ques1 = DataClassQuestionAnswer("Ano ang PANGUNGUSAP? ",
            "A. Ito ay may lamang kwento at bagumbayan sa bahay.",
            "B. Ito ay isang buhay na yunit ng wika na nagpapahayag ng kaisipan.",
            "C. Ito ay kwento ni Jose Rizal ng Noli Me Tangere.",
            "D. Ito ay kamalayan sa bansa at buong lupa ng Luzon.",
            2)
        questionList.add(ques1)
        val ques2 = DataClassQuestionAnswer("Piliin ang PASALAYSAY sa mga sumusunod",
            "A. Maari mo bang akong pahiramin ng iyong lapis?",
            "B. Saan kayo pumunta ngayong bakasyon?",
            "C. Naku! Nakalimutan ko ang aking aklat.",
            "D. Ang mga bata ay naglalaro sa labas ng bahay.",
            4)
        questionList.add(ques2)
        val ques3 = DataClassQuestionAnswer("Piliin ang PATANONG sa mga sumusunod",
            "A. Maari mo bang akong pahiramin ng iyong lapis?",
            "B. Saan kayo pumunta ngayong bakasyon?",
            "C. Naku! Nakalimutan ko ang aking aklat.",
            "D. Ang mga bata ay naglalaro sa labas ng bahay.",
            2)
        questionList.add(ques3)
        val ques4 = DataClassQuestionAnswer("Piliin ang PAUTOS sa mga sumusunod",
            "A. Maari mo bang akong pahiramin ng iyong lapis?",
            "B. Saan kayo pumunta ngayong bakasyon?",
            "C. Naku! Nakalimutan ko ang aking aklat.",
            "D. Ang mga bata ay naglalaro sa labas ng bahay.",
            1)
        questionList.add(ques4)
        val ques5 = DataClassQuestionAnswer("Piliin ang PADAMDAM sa mga sumusunod",
            "A. Maari mo bang akong pahiramin ng iyong lapis?",
            "B. Saan kayo pumunta ngayong bakasyon?",
            "C. Naku! Nakalimutan ko ang aking aklat.",
            "D. Ang mga bata ay naglalaro sa labas ng bahay.",
            3)
        questionList.add(ques5)
        //2
        val ques6 = DataClassQuestionAnswer("Ano ang TAYUTAY? ",
            "A. Ito ay mga pahayag o pagpapahayag sa pamamagitan ng mga di-karaniwang paggamit ng wika.",
            "B. Ito ay sining ng pagsusulat o pagsasalaysay ng mga ideya, kaisipan, damdamin, at karanasan ng tao",
            "C. Ito ay pagpapahayag sa ibang paraan gamit ang kakaibang salita",
            "D. Ito ay kamalayan sa bansa at buong lupa ng Luzon.",
            2)
        questionList.add(ques6)
        val ques7 = DataClassQuestionAnswer("Piliin ang PAGWAWANGIS sa mga sumusunod",
            "A. Ang pag-ibig ay parang isang rosas na sumisiklab sa puso.",
            "B. Naiinlove ako sa kanya nang paulit-ulit sa bawat araw.",
            "C. Ang mga ulap ay umaalon-alon sa himpapawid na parang mga malalambot na kumot.",
            "D. Bang! Narinig ko ang malakas na putok ng baril.",
            1)
        questionList.add(ques7)
        val ques8 = DataClassQuestionAnswer("Piliin ang PAGMAMALABIS sa mga sumusunod",
            "A. Ang pag-ibig ay parang isang rosas na sumisiklab sa puso.",
            "B. Naiinlove ako sa kanya nang paulit-ulit sa bawat araw.",
            "C. Ang mga ulap ay umaalon-alon sa himpapawid na parang mga malalambot na kumot.",
            "D. Bang! Narinig ko ang malakas na putok ng baril.",
            2)
        questionList.add(ques8)
        val ques9 = DataClassQuestionAnswer("Piliin ang PERSONIPIKASYON sa mga sumusunod",
            "A. Ang pag-ibig ay parang isang rosas na sumisiklab sa puso.",
            "B. Naiinlove ako sa kanya nang paulit-ulit sa bawat araw.",
            "C. Ang mga ulap ay umaalon-alon sa himpapawid na parang mga malalambot na kumot.",
            "D. Bang! Narinig ko ang malakas na putok ng baril.",
            3)
        questionList.add(ques9)
        val ques10 = DataClassQuestionAnswer("Piliin ang PAGHIHIMIG sa mga sumusunod",
            "A. Ang pag-ibig ay parang isang rosas na sumisiklab sa puso.",
            "B. Naiinlove ako sa kanya nang paulit-ulit sa bawat araw.",
            "C. Ang mga ulap ay umaalon-alon sa himpapawid na parang mga malalambot na kumot.",
            "D. Bang! Narinig ko ang malakas na putok ng baril.",
            4)
        questionList.add(ques10)
        //3
        val ques11 = DataClassQuestionAnswer("Ano ang PANITIKAN? ",
            "A. Ito ay sining ng pagsusulat o pagsasalaysay ng mga ideya, kaisipan, damdamin, at karanasan ng tao gamit ang wika.",
            "B. Ang panitikan ay nagpapakita lamang ng makabagong teknolohiya at siyensya, at hindi ito bahagi ng kultura.",
            "C. Ang panitikan ay nagbibigay lamang ng katuwaan at walang halaga sa pag-unlad ng isang bansa.",
            "D. Panitikan ay isang uri ng pag-aaral tungkol sa mga paniniwala at ritwal ng mga sinaunang tribo.",
            1)
        questionList.add(ques11)
        val ques12 = DataClassQuestionAnswer("Piliin ang PATULA sa mga sumusunod",
            "A. Uri ng panitikan kung saan isinasalaysay ang mga pangyayari sa pamamagitan ng mga karakter, tagpo, at tunggalian sa loob ng maikling oras.",
            "B. Masalimuot na kuwento na may mahabang pagkukwento, mga tauhan, at mga sub-plot. ",
            "C. Uri ng panitikan kung saan ang mga salita ay may estruktura at ritmo.",
            "D. Uri ng panitikan kung saan ang mga karakter ay nagpapahayag ng kanilang mga saloobin at damdamin sa pamamagitan ng mga linya o dialogue.",
            3)
        questionList.add(ques12)
        val ques13 = DataClassQuestionAnswer("Piliin ang MAIKILING KWENTO sa mga sumusunod",
            "A. Uri ng panitikan kung saan isinasalaysay ang mga pangyayari sa pamamagitan ng mga karakter, tagpo, at tunggalian sa loob ng maikling oras.",
            "B. Masalimuot na kuwento na may mahabang pagkukwento, mga tauhan, at mga sub-plot. ",
            "C. Uri ng panitikan kung saan ang mga salita ay may estruktura at ritmo.",
            "D. Uri ng panitikan kung saan ang mga karakter ay nagpapahayag ng kanilang mga saloobin at damdamin sa pamamagitan ng mga linya o dialogue.",
            1)
        questionList.add(ques13)
        val ques14 = DataClassQuestionAnswer("Piliin ang NOBELA sa mga sumusunod",
            "A. Uri ng panitikan kung saan isinasalaysay ang mga pangyayari sa pamamagitan ng mga karakter, tagpo, at tunggalian sa loob ng maikling oras.",
            "B. Masalimuot na kuwento na may mahabang pagkukwento, mga tauhan, at mga sub-plot. ",
            "C. Uri ng panitikan kung saan ang mga salita ay may estruktura at ritmo.",
            "D. Uri ng panitikan kung saan ang mga karakter ay nagpapahayag ng kanilang mga saloobin at damdamin sa pamamagitan ng mga linya o dialogue.",
            2)
        questionList.add(ques14)
        val ques15 = DataClassQuestionAnswer("Piliin ang DULA sa mga sumusunod",
            "A. Uri ng panitikan kung saan isinasalaysay ang mga pangyayari sa pamamagitan ng mga karakter, tagpo, at tunggalian sa loob ng maikling oras.",
            "B. Masalimuot na kuwento na may mahabang pagkukwento, mga tauhan, at mga sub-plot. ",
            "C. Uri ng panitikan kung saan ang mga salita ay may estruktura at ritmo.",
            "D. Uri ng panitikan kung saan ang mga karakter ay nagpapahayag ng kanilang mga saloobin at damdamin sa pamamagitan ng mga linya o dialogue.",
            4)
        questionList.add(ques15)
        //4
        val ques16 = DataClassQuestionAnswer("Ano ang KARUNUNGANG BAYAN? ",
            "A. Ang karunungang bayan ay isang pampasaya o kalakalang inaalok sa mga turista.",
            "B. Ito ay isang uri ng sining o kultura na hindi konektado sa kasaysayan.",
            "C. Ito aytumutukoy lamang sa kaalaman ng mga mamamayan tungkol sa mga produktong lokal.",
            "D. Ito ay isang sangay ng panitikan kung saan nagiging daan upang maipahayag ang mga kaisipan na nakapapabilang sa bawat kultura ng isang tribo.",
            4)
        questionList.add(ques16)
        val ques17 = DataClassQuestionAnswer("Piliin ang SALAWIKAIN sa mga sumusunod",
            "Ito ay nakaugalian nang sabihin at nagsisilbing batas at tuntunin ng kagandahang-asal ng ating mga ninuno.",
            "Isang uri ng Karunungang Bayann na ang kasabihang walang nakatagong kahulugan.",
            "Ito ay mga palaisipan o pahulaan na karaniwang may mga malalalim na kahulugan.",
            "Ito ay mga pangungusap na naglalaman ng mga aral o katotohanan tungkol sa buhay.",
            1)
        questionList.add(ques17)
        val ques18 = DataClassQuestionAnswer("Piliin ang SAWIKAIN sa mga sumusunod",
            "Ito ay nakaugalian nang sabihin at nagsisilbing batas at tuntunin ng kagandahang-asal ng ating mga ninuno.",
            "Isang uri ng Karunungang Bayann na ang kasabihang walang nakatagong kahulugan.",
            "Ito ay mga palaisipan o pahulaan na karaniwang may mga malalalim na kahulugan.",
            "Ito ay mga pangungusap na naglalaman ng mga aral o katotohanan tungkol sa buhay.",
            2)
        questionList.add(ques18)
        val ques19 = DataClassQuestionAnswer("Piliin ang KASABIHAN sa mga sumusunod",
            "Ito ay nakaugalian nang sabihin at nagsisilbing batas at tuntunin ng kagandahang-asal ng ating mga ninuno.",
            "Isang uri ng Karunungang Bayann na ang kasabihang walang nakatagong kahulugan.",
            "Ito ay mga palaisipan o pahulaan na karaniwang may mga malalalim na kahulugan.",
            "Ito ay mga pangungusap na naglalaman ng mga aral o katotohanan tungkol sa buhay.",
            4)
        questionList.add(ques19)
        val ques20 = DataClassQuestionAnswer("Piliin ang BUGTONG sa mga sumusunod",
            "Ito ay nakaugalian nang sabihin at nagsisilbing batas at tuntunin ng kagandahang-asal ng ating mga ninuno.",
            "Isang uri ng Karunungang Bayann na ang kasabihang walang nakatagong kahulugan.",
            "Ito ay mga palaisipan o pahulaan na karaniwang may mga malalalim na kahulugan.",
            "Ito ay mga pangungusap na naglalaman ng mga aral o katotohanan tungkol sa buhay.",
            3)
        questionList.add(ques20)
        //5
        val ques21 = DataClassQuestionAnswer("Ano ang ASPETONG PANDIWA? ",
            "A. Ang aspetong bayan ay tumutukoy sa isang pook o lugar na wala itong kinalaman sa buhay ng mga tao.",
            "B. Ito ay isang bahagi ng kultura na hindi mahalaga sa pag-unlad ng isang komunidad.",
            "C. Ito ay mahalaga dahil nagbibigay-kahulugan sa oras at konteksto ng mga kilos o gawain sa isang pangungusap",
            "D. Ang aspetong bayan ay isang konsepto na hindi nagbabago o hindi napapansin ng mga tao sa isang lugar.",
            3)
        questionList.add(ques21)
        val ques22 = DataClassQuestionAnswer("Piliin ang NAGANAP sa mga sumusunod",
            "A. Natapos na ang paligsahan kahapon.",
            "B. Ako ay naglalakad sa park.",
            "C. Bukas, magaganap ang kasal ng aking kaibigan.",
            "D. Kabibili ko lang ng coke sa tindatahan.",
            1)
        questionList.add(ques22)
        val ques23 = DataClassQuestionAnswer("Piliin ang NAGAGANAP sa mga sumusunod",
            "A. Natapos na ang paligsahan kahapon.",
            "B. Ako ay naglalakad sa park.",
            "C. Bukas, magaganap ang kasal ng aking kaibigan.",
            "D. Kabibili ko lang ng coke sa tindatahan.",
            2)
        questionList.add(ques23)
        val ques24 = DataClassQuestionAnswer("Piliin ang MAGAGANAP sa mga sumusunod",
            "A. Natapos na ang paligsahan kahapon.",
            "B. Ako ay naglalakad sa park.",
            "C. Bukas, magaganap ang kasal ng aking kaibigan.",
            "D. Kabibili ko lang ng coke sa tindatahan.",
            3)
        questionList.add(ques24)
        val ques25 = DataClassQuestionAnswer("Piliin ang KAKATAPOS sa mga sumusunod",
            "A. Natapos na ang paligsahan kahapon.",
            "B. Ako ay naglalakad sa park.",
            "C. Bukas, magaganap ang kasal ng aking kaibigan.",
            "D. Kabibili ko lang ng coke sa tindatahan.",
            4)
        questionList.add(ques25)
        return questionList
    }
}