object : CountDownTimer(30000, 1000) {
 
      override fun onTick(millisUntilFinished: Long) {
          mTextField.setText("seconds remaining: " + millisUntilFinished / 1000) // burda Her Saniye Azaldıgında Nabayım Diyor biz de ekrana yansıt diyoruz
      }
 
      override fun onFinish() {
          mTextField.setText("done!") // burdada Geri Sayım Bitince Napayım Diyor Bizde Ekrana Bitti Yazdırıyoruz
      }
  }.start()


//Burdaki 30000 sayısı MiliSaniyedir Yani 30 Saniyedir ordaki 1000 de 1 Sayniye Demektir Ve Diyoki Komutta 30 saniyeyi 1 eksilt yani 30 dan geri sayıyor
