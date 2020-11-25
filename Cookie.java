class Cookie{
  private int count;
  private int tempF;
  private int timeMinutes;
  private boolean isReady;

  Cookie(){
    count = 0;
    tempF = 0;
    timeMinutes = 0;
    isReady = false;
  }

  Cookie(int aCount, int aTemp, int aTimeMinutes){
    count = aCount;
    tempF = aTemp;
    timeMinutes = aTimeMinutes;
    isReady = false;
  }

  boolean getIsReady(){
    return isReady;
  }

  void setCount(int aCount){
    count = aCount;
  }

  void bakeCookie(int aTemp, int aTimeMinutes){
    System.out.println(count + " cookies were baked at " + aTemp + " degrees F for " + aTimeMinutes + " minutes");
    isReady = true;
  }

  


}