package shuhbam.myzodiacsign

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    var zodiacname:TextView?=null
    var yourzodiac:TextView?=null
    var sign:ImageView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnselect=findViewById<Button>(R.id.btn_select_date)
        zodiacname=findViewById(R.id.your_zodiac_sign)
        yourzodiac=findViewById(R.id.your_zodiac)
        sign=findViewById(R.id.zodiac_image)
        btnselect.setOnClickListener{
            run()
        }
    }
    private fun run(){
        val getdate=Calendar.getInstance()
        val year=getdate.get(Calendar.YEAR)
        val month=getdate.get(Calendar.MONTH)
        var day=getdate.get(Calendar.DAY_OF_MONTH)
        DatePickerDialog(this,{view,pickedyear,pickedmonth,pickeday->
            val selectedate="$pickeday/${pickedmonth+1}/$pickedyear"
            val realpickedmonth=pickedmonth+1
            yourzodiac?.text="YOUR ZODIAC SIGN IS "
            Toast.makeText(this,"YOUR SELECTED DATE IS ${selectedate}",Toast.LENGTH_LONG).show()
            if(pickeday>=21 && realpickedmonth==3 || pickeday<=19 && realpickedmonth==4){
                zodiacname?.text="Aries"
                sign?.setImageResource(R.drawable.aries)
            }
            else if(pickeday>=20 && realpickedmonth==4 || pickeday<=20 && realpickedmonth==5){
                zodiacname?.text="Taurus"
                sign?.setImageResource(R.drawable.taurus)

            }
            else if(pickeday>=21 && realpickedmonth==5 || pickeday<=20 && realpickedmonth==6){
                zodiacname?.text="Gemini"
                sign?.setImageResource(R.drawable.gemini)
            }
            else if(pickeday>=21 && realpickedmonth==6 || pickeday<=22 && realpickedmonth==7){
                zodiacname?.text="Cancer"
                sign?.setImageResource(R.drawable.cancer)
            }
            else if(pickeday>=23 && realpickedmonth==7 || pickeday<=22 && realpickedmonth==8){
                zodiacname?.text="Leo"
                sign?.setImageResource(R.drawable.leo)
            }
            else if(pickeday>=23 && realpickedmonth==8 || pickeday<=22 && realpickedmonth==9){
                zodiacname?.text="Virgo"
                sign?.setImageResource(R.drawable.virgo)
            }
            else if(pickeday>=23 && realpickedmonth==9 || pickeday<=23 && realpickedmonth==10){
                zodiacname?.text="Libra"
                sign?.setImageResource(R.drawable.libra)
            }
            else if(pickeday>=23 && realpickedmonth==10 || pickeday<=21 && realpickedmonth==11){
                zodiacname?.text="Scorpio"
                sign?.setImageResource(R.drawable.scorpio)
            }
            else if(pickeday>=22 && realpickedmonth==11 || pickeday<=21 && realpickedmonth==12){
                zodiacname?.text="Sagittaurus"
                sign?.setImageResource(R.drawable.sagitaurus)
            }
            else if(pickeday>=22 && realpickedmonth==12 || pickeday<=19 && realpickedmonth==1){
                zodiacname?.text="Capricorn"
                sign?.setImageResource(R.drawable.capricorn)
            }
            else if(pickeday>=20 && realpickedmonth==1 || pickeday<=18 && realpickedmonth==2){
                zodiacname?.text="Aquirus"
                sign?.setImageResource(R.drawable.aquirus)
            }
            else{
                zodiacname?.text="Pisces"
                sign?.setImageResource(R.drawable.pisces)
            }
        },year,month,day).show()
    }
}
