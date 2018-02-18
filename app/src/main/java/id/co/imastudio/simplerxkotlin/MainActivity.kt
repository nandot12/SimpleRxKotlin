package id.co.imastudio.simplerxkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.Flowable
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Single
import java.util.Locale.filter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //sample 1

        Observable.fromArray("nando","septian",
                "husni","padang","rx","belajar")
                //operator filter
                //di ambil di sesuai kondisi
                .filter { data -> data.contains("nando") }
                .subscribe {
                    data -> Log.d("data : " ,data.toString())
                }


        //sample 2
        Flowable.just(12,12,23
                ,34,23)
                //convert data di plosotan jadi double
                .map { t -> t.toDouble() }
                //filter data di plosotan kurang dari 15
                .filter {  t: Double ->  t < 15}

                .subscribe {
                 t: Double? ->
                    Log.d("data :" , t.toString())
                }

        //sample 3
        




    }
}
