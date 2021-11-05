package id.ac.persiapan_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.iwatch,"TEKNOLOGI","IWATCH",
                " iWatch, atau perusahaan menyebutnya Apple Watch." +
                "Apple memaksimalkan kinerja Apple Watch dengan menghadirkan tombol Digital Crown."))

        data?.add(DataModel(R.drawable.ac,"TEKNOLOGI","AIR CONDITIONER",
                "merupakan alat yang berfungsi untuk mengondisikan udara. AC sendiri memiliki fungsi sebagai penyejuk udara di dalam ruangan." +
                "sistem atau mesin yang dirancang untuk menstabilkan suhu udara dan kelembapan suatu area "))

        data?.add(DataModel(R.drawable.camera,"TEKNOLOGI","CAMERA",
                "merupakan suatu peranti untuk membentuk dan merekam " +
                "suatu bayangan potret pada lembaran film. "))

        data?.add(DataModel(R.drawable.modemwifi,"TEKNOLOGI","MODEM WIFI",
                "biasa disebut dengan MiFi adalah sumber internet penting bagi anak kost tanpa fasilitas internet," +
                "pekerja atau anak kuliah dengan mobilitas tinggi, hingga pengguna rumahan yang sulit dijangkau TV kabel dan internet."))

        data?.add(DataModel(R.drawable.processor,"TEKNOLOGI","PROCESSOR",
                "salah satu komponen penting komputer yang berfungsi untuk memproses data dan mengontrol sistem yang ada pada komputer" +
                "Processor juga bisa disebut sebagai otak dari komputer."))

        data?.add(DataModel(R.drawable.ssd,"TEKNOLOGI","SOLID-STATE DRIVE (SSD)",
                "perangkat penyimpanan generasi baru yang digunakan di komputer." +
                "SSD menggantikan hard disk mekanis tradisional dengan menggunakan memori berbasis flash, yang secara signifikan lebih cepat."))

        data?.add(DataModel(R.drawable.tv,"TEKNOLOGI","TELEVISION",
                "sebagai alat informasi" +
                "bagi masyarakat yang membutuhkan informasi baik nasional maupun internasional."))


        data?.add(DataModel(R.drawable.vr,"TEKNOLOGI","VIRTUAL REALITY",
                "realitas maya adalah teknologi yang membuat pengguna dapat berinteraksi dengan suatu lingkungan" +
                "virtual dengan media komputer yang disimulasikan secara realtime."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.nomer)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }
        })
    }
}