package ebubekir.tosun.ders4plakauygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ebubekir.tosun.ders4plakauygulamasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (binding.editTextNumber.text.isNotEmpty()){
                var plakaKodu = binding.editTextNumber.text.toString().toInt()
                when(plakaKodu){
                    1->binding.textView.text= "Adana"
                    2->binding.textView.text= "Adiyaman"
                    3->binding.textView.text= "Afyonkarahisar"
                    4->binding.textView.text= "Agri"
                    5->binding.textView.text= "Amasya"
                    6->binding.textView.text= "Ankara"
                    7->binding.textView.text= "Antalya"
                    8->binding.textView.text= "Artvin"
                    9->binding.textView.text= "Aydin"
                    10->binding.textView.text= "Balikesir"
                    11->binding.textView.text= "Bilecik"
                    12->binding.textView.text= "Bingöl"
                    13->binding.textView.text= "Bitlis"
                    14->binding.textView.text= "Bolu"
                    15->binding.textView.text= "Burdur"
                    16->binding.textView.text= "Bursa"
                    17->binding.textView.text= "Canakkale"
                    18->binding.textView.text= "Cankiri"
                    19->binding.textView.text= "Corum"
                    20->binding.textView.text= "Denizli"
                    21->binding.textView.text= "Diyarbakir"
                    22->binding.textView.text= "Edirne"
                    23->binding.textView.text= "Elazig"
                    24->binding.textView.text= "Erzincan"
                    25->binding.textView.text= "Erzurum"
                    26->binding.textView.text= "Eskisehir"
                    27->binding.textView.text= "Gaziantep"
                    28->binding.textView.text= "Giresun"
                    29->binding.textView.text= "Gümüshane"
                    30->binding.textView.text= "Hakkari"
                    31->binding.textView.text= "Hatay"
                    32->binding.textView.text= "Isparta"
                    33->binding.textView.text= "Mersin"
                    34->binding.textView.text= "Istanbul"
                    35->binding.textView.text= "Izmir"
                    36->binding.textView.text= "Kars"
                    37->binding.textView.text= "Kastamonu"
                    38->binding.textView.text= "Kayseri"
                    39->binding.textView.text= "Kirklareli"
                    40->binding.textView.text= "Kirsehir"
                    41->binding.textView.text= "Kocaeli"
                    42->binding.textView.text= "Konya"
                    43->binding.textView.text= "Kütahya"
                    44->binding.textView.text= "Malatya"
                    45->binding.textView.text= "Manisa"
                    46->binding.textView.text= "Kahramanmaras"
                    47->binding.textView.text= "Mardin"
                    48->binding.textView.text= "Mugla"
                    49->binding.textView.text= "Mus"
                    50->binding.textView.text= "Nevsehir"
                    51->binding.textView.text= "Nigde"
                    52->binding.textView.text= "Ordu"
                    53->binding.textView.text= "Rize"
                    54->binding.textView.text= "Sakarya"
                    55->binding.textView.text= "Samsun"
                    56->binding.textView.text= "Siirt"
                    57->binding.textView.text= "Sinop"
                    58->binding.textView.text= "Sivas"
                    59->binding.textView.text= "Tekirdag"
                    60->binding.textView.text= "Tokat"
                    61->binding.textView.text= "Trabzon"
                    62->binding.textView.text= "Tunceli"
                    63->binding.textView.text= "Sanliurfa"
                    64->binding.textView.text= "Usak"
                    65->binding.textView.text= "Van"
                    66->binding.textView.text= "Yozgat"
                    67->binding.textView.text= "Zonguldak"
                    68->binding.textView.text= "Aksaray"
                    69->binding.textView.text= "Bayburt"
                    70->binding.textView.text= "Karaman"
                    71->binding.textView.text= "KIRIKKALE"
                    72->binding.textView.text= "Batman"
                    73->binding.textView.text= "Sirnak"
                    74->binding.textView.text= "Bartin"
                    75->binding.textView.text= "Ardahan"
                    76->binding.textView.text= "Igdir"
                    77->binding.textView.text= "Yalova"
                    78->binding.textView.text= "Karabük"
                    79->binding.textView.text= "Kilis"
                    80->binding.textView.text= "Osmaniye"
                    81->binding.textView.text= "Düzce"

                    else->{
                        binding.textView.text = "Böyle bir sehir yok"
                    }
                }
            }else{
                binding.textView.text= "Sehir Plaka Kodu Giriniz"
            }
            binding.editTextNumber.text.clear()
        }
    }
}