package com.example.presidenrepublikindonesia

object dataArray {
    private val languages = listOf("Ir.Soekarno","H.M. Soeharto","B.J Habibie","Abdurrahman Wahid",
        "Megawati Soekarnoputri","Susilo Bambang Yudhoyono", "Ir. Joko Widodo")

    val desk = listOf(
        "Presiden Republik Indonesia Pertama",
        "Presiden Republik Indonesia Kedua",
        "Presiden Republik Indonesia Ketiga",
        "Presiden Republik Indonesia Keempat",
        "Presiden Republik Indonesia Kelima",
        "Presiden Republik Indonesia Keenam",
        "Presiden Republik Indonesia Ketujuh"
    )

    private val pictDat = intArrayOf(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )
    val listData : ArrayList<Aturarray>
        get() {
            val list = arrayListOf<Aturarray>()
            for (position in languages.indices){
                val listDat = Aturarray()
                listDat.name = languages[position]
                listDat.detail = desk[position]
                listDat.pict = pictDat[position]
                list.add(listDat)
            }
            return list
        }
}