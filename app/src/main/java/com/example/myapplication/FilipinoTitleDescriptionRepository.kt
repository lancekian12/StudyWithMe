package com.example.myapplication

object FilipinoTitleDescriptionRepository {
    fun getTitleDescriptions(): ArrayList<DataClassTitleDescription> {
        val descriptionList = ArrayList<DataClassTitleDescription>()
        val desc1 = DataClassTitleDescription(
            "Pangunusap",
            "Ang \"pangungusap\" ay isang buhay na yunit ng wika na nagpapahayag ng kaisipan o mensahe.",
            "Ang pag-unawa sa mga iba't ibang uri ng pangungusap ay may malalim na kahalagahan sa komunikasyon.",
            "Pasalaysay, Patanong, Pautos, Padamdam",
            R.drawable.filipinovector1,
            R.drawable.filipinovector2
        )
        descriptionList.add(desc1)
        val desc2 = DataClassTitleDescription(
            "Pasalaysay",
            "Ito ay pangungusap na nagkukuwento o nagsasalaysay. Ito ay nag tatapos sa tuldok(.)",
            "Si Juan ay  tumatakbo ng mabilis dahil gusto niya manalo.",
            "Mga bata ay nag tatanim ng mga halaman",
            R.drawable.takbo,
            R.drawable.nagtanim
        )
        descriptionList.add(desc2)
        val desc3 = DataClassTitleDescription(
            "Patanong",
            "Ito ay uri ng pangungusap na nagsasaad ng isang tanong. Ito ay nag tatapos sa tandang pananong (?).",
            "Anak ano ang iyong binili sa tindahan?",
            "Saan ka pupunta pagkatapos natin kumain?",
            R.drawable.bumili,
            R.drawable.kumakain
        )
        descriptionList.add(desc3)
        val desc4 = DataClassTitleDescription(
            "Pautos",
            "Ito ay uri ng pangungusap na ginagamitan magagalang na salita upang makiusap.",
            "Maari mo bang diligan ang halaman?",
            "Saan ka pupunta pagkatapos natin kumain?",
            R.drawable.diniligan,
            R.drawable.isara
        )
        descriptionList.add(desc4)
        val desc5 = DataClassTitleDescription(
            "Padamdam",
            "Ito ay uri ng pangungusap na nagsasaad ng matinding damdamin tulad ng tuwa, takot o pagkagulat. Nagtatapos ito sa tandang panamdam(!).",
            "Aray! Ang sakit ng aking tuhod ko.",
            "Naku! Ang bata ay nalulunod.",
            R.drawable.masakit,
            R.drawable.nalunod
        )
        descriptionList.add(desc5)
        val desc6 = DataClassTitleDescription(
            "Tayutay",
            "Ang tayutay ay mga pahayag o pagpapahayag sa pamamagitan ng mga di-karaniwang paggamit ng wika.",
            "Ito ay isang paraan ng pagpapahayag na nagbibigay kulay, imahe, o halaga sa teksto.",
            "Pagwawangis, Pagmamalabis, Personipikasyon, Metapora, Paghihimbing",
            R.drawable.tayutayxample1,
            R.drawable.tayutayexample2
        )
        descriptionList.add(desc6)
        val desc7 = DataClassTitleDescription(
            "Pagwawangis",
            "Isang tayutay na nagkukumpara ng dalawang bagay gamit ang mga salitang \"parang,\" \"tulad,\" o \"gayundin.\".",
            "Ang ganda ng buhok niya ay parang gabi, malamlam at makintab",
            "Ang buhay ay tulad ng isang gulong ng palad, minsan ito'y nasa itaas at minsan naman ay nasa ibaba.",
            R.drawable.gulong,
            R.drawable.habanghair
        )
        descriptionList.add(desc7)
        val desc8 = DataClassTitleDescription(
            "Pagmamalabis",
            "Pagpapakita ng sobra-sobrang pagmamay-ari o pagpapahalaga sa isang bagay upang bigyan ito ng diin.",
            "Naiinlove ako sa kanya nang paulit-ulit sa bawat araw.",
            "Ang bag mo ay sobrang bigat, parang dala mo na buong bahay namin!",
            R.drawable.pagmamahal,
            R.drawable.mabigat
        )
        descriptionList.add(desc8)
        val desc9 = DataClassTitleDescription(
            "Personipikasyon",
            "Ito ay uri ng tayutay na pagbibigay ng mga katangian ng tao sa mga bagay o hayop.",
            "Ang mga ulap ay umaalon-alon sa himpapawid na parang mga malalambot na kumot.",
            "Ang mga alon ay sumisigaw ng kanilang galit sa baybayin.",
            R.drawable.clouds,
            R.drawable.waves
        )
        descriptionList.add(desc9)
        val desc10 = DataClassTitleDescription(
            "Paghihimig",
            "Paggamit ng mga salita na tunog o tunog na tila naghahayag ng kahulugan.",
            "Bang! Narinig ko ang malakas na putok ng baril.",
            "Tik-tak! Ang lakas ng ulan",
            R.drawable.baril,
            R.drawable.raindrop
        )
        descriptionList.add(desc10)
        val desc11 = DataClassTitleDescription(
            "Panitikan",
            "Ang panitikan ay sining ng pagsusulat o pagsasalaysay ng mga ideya, kaisipan, damdamin, at karanasan ng tao gamit ang wika. ",
            "Ito ay maaaring isalin sa iba't ibang anyo, tulad ng tula, kwento, dula, sanaysay, nobela, at iba pa. ",
            "Ang panitikan ay isang mahalagang bahagi ng kultura at sining ng isang bansa.",
            R.drawable.panitikanvector,
            R.drawable.panitkanvector2
        )
        descriptionList.add(desc11)
        val desc12 = DataClassTitleDescription(
            "Tula",
            "Uri ng panitikan kung saan ang mga salita ay may estruktura at ritmo.",
            "Sa tabi ng ilog, ako'y naglalakad mag-isa...",
            "Sa isang munting buhay, pag-asa'y laging sumiklab.",
            R.drawable.tula_lalaki,
            R.drawable.tula_babae
        )
        descriptionList.add(desc12)
        val desc13 = DataClassTitleDescription(
            "Maikling Kwento",
            "Uri ng panitikan kung saan isinasalaysay ang mga pangyayari sa pamamagitan ng mga karakter, tagpo, at tunggalian sa loob ng maikling oras.",
            "Ang Kwento ng Kuneho at ang Pagong",
            "Ang Alamat ng Matapang na Pusa",
            R.drawable.kunehoatpagong,
            R.drawable.strongcat
        )
        descriptionList.add(desc13)
        val desc14 = DataClassTitleDescription(
            "Nobela",
            "Masalimuot na kuwento na may mahabang pagkukwento, mga tauhan, at mga sub-plot. ",
            "Noli Me Tangere ni Jose Rizal",
            "El Filibusterismo",
            R.drawable.nolimetangere,
            R.drawable.elfilibusterismo
        )
        descriptionList.add(desc14)
        val desc15 = DataClassTitleDescription(
            "Dula",
            "Uri ng panitikan kung saan ang mga karakter ay nagpapahayag ng kanilang mga saloobin at damdamin sa pamamagitan ng mga linya o dialogue.",
            "   Ibong Adarna",
            "   Romeo at Juliet",
            R.drawable.ibongadarna,
            R.drawable.romeoandjuliet
        )
        descriptionList.add(desc15)
        val desc16 = DataClassTitleDescription(
            "Karunungang Bayan",
            "Ito ay isang sangay ng panitikan kung saan nagiging daan upang maipahayag ang mga kaisipan na nakapapabilang sa bawat kultura ng isang tribo.",
            "Naging mayaman tayo sa kaalaman ng komunidad bago ang Kastila dumating.",
            "Salawikain, Sawikain, Bugtong, Kasabihan",
            R.drawable.filipinovector3,
            R.drawable.filipinovector4
        )
        descriptionList.add(desc16)
        val desc17 = DataClassTitleDescription(
            "Salawikain",
            "Ito ay nakaugalian nang sabihin at nagsisilbing batas at tuntunin ng kagandahang-asal ng ating mga ninuno.",
            "Ang maniwala sa sabi-sabi, walang bait sa sarili.",
            "Hamak mang basahan, may panahong kailangan.",
            R.drawable.persontelling,
            R.drawable.equal
        )
        descriptionList.add(desc17)
        val desc18 = DataClassTitleDescription(
            "Sawikain",
            "Isang uri ng Karunungang Bayann na ang kasabihang walang nakatagong kahulugan.",
            "Nasa Diyos ang awa, nasa tao ang gawa.",
            "Ang sakit kapag naagapan, madali itong malulunasan.",
            R.drawable.workhard,
            R.drawable.healthy
        )
        descriptionList.add(desc18)
        val desc19 = DataClassTitleDescription(
            "Bugtong",
            "Ito ay mga palaisipan o pahulaan na karaniwang may mga malalalim na kahulugan.",
            "Buto't balat Lumilipad. Sagot (Saranggola)",
            "Isang prinsesa nakaupo sa tasa. Sagot (Kasoy)",
            R.drawable.kite,
            R.drawable.kasoy
        )
        descriptionList.add(desc19)
        val desc20 = DataClassTitleDescription(
            "Kasabihan",
            "Ito ay mga pangungusap na naglalaman ng mga aral o katotohanan tungkol sa buhay o mga pangyayari.",
            "Ang taong nagigipit, sa patalim kumakapit.",
            "Walang matigas na tinapay sa mainit na kape.",
            R.drawable.matalim,
            R.drawable.success
        )
        descriptionList.add(desc20)
        val desc21 = DataClassTitleDescription(
            "Aspeto ng Pandiwa",
            "Ito ay nagpapakita kung kailan nangyari, nangyayari, mangyayari o kung ipagpapatuloy pa ang nagaganap na kilos",
            "Ito ay mahalaga dahil nagbibigay-kahulugan sa oras at konteksto ng mga kilos o gawain sa isang pangungusap",
            "Naganap, Nagaganap, Magaganap, Kakatapos",
            R.drawable.filipinovector6,
            R.drawable.filipinovector5
        )
        descriptionList.add(desc21)
        val desc22 = DataClassTitleDescription(
            "Naganap o Imperpektibo",
            "Ito ay tumutukoy sa kilos o gawain na magaganap sa hinaharap, kung saan wala pa itong natutuldukan o natapos na oras.",
            "Kinagat ko ang lamok.",
            "Ako ay nagwalis kahapon.",
            R.drawable.lamok,
            R.drawable.walis
        )
        descriptionList.add(desc22)
        val desc23 = DataClassTitleDescription(
            "Nagaganap o Perpektibo",
            "Ito ay tumutukoy sa kilos o gawain na kasalukuyang nagaganap, o sa mga pangkaraniwang kilos na naganap o nagaganap nang paulit-ulit.",
            "Ako ay sumusulat ng tula.",
            "Naglalakad ako sa park.",
            R.drawable.sulat,
            R.drawable.park
        )
        descriptionList.add(desc23)
        val desc24 = DataClassTitleDescription(
            "Magaganap o Kontemplatibo",
            "Ito ay uri ng tayutay na pagbibigay ng mga katangian ng tao sa mga bagay o hayop.",
            "Bukas, magkikita kami ng mga kaibigan ko.",
            "Magkakaroon ng pista sa aming bayan sa susunod na buwan.",
            R.drawable.persontelling,
            R.drawable.festival
        )
        descriptionList.add(desc24)
        val desc25 = DataClassTitleDescription(
            "Kakatapos",
            "Ito ay nagpapahayag ng isang kilos o gawain na natapos lamang sa malapit na oras o kamakailan.",
            "Kagagaling ko lang sa paaralan",
            "Kabibili ko lang ng ulam sa palengke",
            R.drawable.leavingschool,
            R.drawable.buyingfood
        )
        descriptionList.add(desc25)
        return descriptionList
    }
}
