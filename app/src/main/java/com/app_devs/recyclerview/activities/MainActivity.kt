package com.app_devs.recyclerview.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.app_devs.recyclerview.adapters.EntryAdapter
import com.app_devs.recyclerview.models.EntryModel
import com.app_devs.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val list:ArrayList<EntryModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()
        binding.rv.layoutManager=LinearLayoutManager(this)
        val adapter= EntryAdapter(this,list)
        binding.rv.adapter=adapter


    }
    private fun loadData()
    {
        list.add(EntryModel("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg","Photo 1"))
        list.add(EntryModel("https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","Photo 2"))
        list.add(EntryModel("https://images.unsplash.com/photo-1503023345310-bd7c1de61c7d?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8aHVtYW58ZW58MHx8MHx8&ixlib=rb-1.2.1&w=1000&q=80","Photo 3"))
        list.add(EntryModel("https://images.unsplash.com/photo-1581456495146-65a71b2c8e52?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1000&q=80","Photo 4"))
        list.add(EntryModel("https://cdn.pixabay.com/photo/2018/10/30/16/06/water-lily-3784022__480.jpg","Photo 5"))
        list.add(EntryModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkujUqbF5cm1oXmq1Dy0KFFszeYLDkph8cCgQwLDKbIoQlfOAVF7bOvy-VHl2fNrpsEHg&usqp=CAU","Photo 6"))
        list.add(EntryModel("https://cloudfront-us-east-2.images.arcpublishing.com/reuters/F6INOOMSRRL5XOOQDRPZUWPWBA.jpg","Photo 7"))
        list.add(EntryModel("https://analyticsindiamag.com/wp-content/uploads/2020/10/7d744a684fe03ebc7e8de545f97739dd.jpg","Photo 8"))
        list.add(EntryModel("https://images.theconversation.com/files/122137/original/image-20160511-18171-kulas4.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=926&fit=clip","Photo 9"))
        list.add(EntryModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNbjmnlzLycPBzci1ZnnWb_nivt8HLtto5DA&usqp=CAU","Photo 10"))
        list.add(EntryModel("https://clearreview.imgix.net/images/content/black-binocular-on-round-device-63901-1.jpg?auto=format%2Ccompress&dpr=1&fp-x=0.5&fp-y=0.5&h=560&ixlib=php-2.1.1&w=820","Photo 11"))
        list.add(EntryModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTphdxAyPMnHkLToCcKYG_VYlCvakOC7XFxzLC35788Ppxhk84CD5g1cfLDJYk8awbymdY&usqp=CAU","Photo 12"))

    }


}