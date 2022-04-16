package kg.geektech.kotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.geektech.kotlin2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var image = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addPictures()
        setupListener()
    }

    private fun addPictures() {
        image.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ2mDqg1JCZHVy92VYcgx5i_RRZZS7Ij7MHW9afTN6DiD4DgwctrVtaQdrZr8atQUUNDFs&usqp=CAU.jpeg")
        image.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT37p-AKdSRj-zQiWhqXctl_h8VJsAgvIg_28982O6044R52tN4wXj_uHnwMsWiiMpvzLQ&usqp=CAU.jpeg")
        image.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR09dxNQVHENTIJ8NTiuG2IPStxE7mMobsGUQ&usqp=CAU.jpeg")
        image.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZR7cUPf7dwlO3L5MIXLTuYPvUgQSWCDGcEQ&usqp=CAU.jpeg")
        image.add("https://i.pinimg.com/236x/b4/d2/94/b4d294d5ae0be7f3d085c7c223fa5597.jpg")
        image.add("https://i.pinimg.com/236x/22/46/56/2246562b46b81f2991723aa1cacd8ca5.jpg")
        image.add("https://i.pinimg.com/236x/ec/94/7d/ec947d4c309fe67d34ea5506a0999250.jpg")
        image.add("https://i.pinimg.com/236x/d6/b2/c2/d6b2c2e0d9df95df359f0a4aaa14146b.jpg")
        image.add("https://image.tmdb.org/t/p/w600_and_h900_bestv2/wTGuHmMIBBgKakY80J1D52VvQKI.jpg")
        image.add("https://image.tmdb.org/t/p/w600_and_h900_bestv2/jHWmNr7m544fJ8eItsfNk8fs2Ed.jpg")

    }

    private fun setupListener() {
        binding.submit.setOnClickListener{
            image.add(binding.editSecond.text.toString())
            binding.imageView1.loadImage(binding.editSecond.text.toString())
        }
        binding.randomButton.setOnClickListener{
            binding.imageView1.loadImage(image.random())
        }
    }
}