package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentChanel;
    private int currentVolume;
    private int numberChanel = 10-1;




    //public Radio(int numberChanel) {
     //   this.numberChanel = numberChanel - 1;
   // }

   // public Radio(){

  //  }

  // public int getNumberChanel() {
   //     return this.numberChanel;
   // }


  //  public int getCurrentChanel() {
     //   return currentChanel;
 //   }

    public void setCurrentChanel(int currentChanel) {
        if (currentChanel < 0) {
            currentChanel = 9;
        }
        if (currentChanel > 9) {
            currentChanel = 0;
        }
        this.currentChanel = currentChanel;
    }

    public void next() {
        setCurrentChanel(currentChanel = currentChanel +1);
    }

    public void prev() {
        setCurrentChanel(currentChanel = currentChanel -1);
    }

   // public int getCurrentVolume() {
     //   return currentVolume;
    //}

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public void up() {
        setCurrentVolume(currentVolume = currentVolume +1);
    }

    public void down() {
        setCurrentVolume(currentVolume = currentVolume -1);
    }

}
