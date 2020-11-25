class Sugar extends Cookie{
  private String shape;
  private boolean isDecorated;

  Sugar(){
    shape = "";
    isDecorated = false;
  }

  Sugar(String aShape){
    shape = aShape;
    isDecorated = false;
  }

  String getShape(){
    return shape;
  }

  void setShape(String aShape){
    shape = aShape;
  }

  void cutShapes(String aShape, int cookiesToCut){
    System.out.println(cookiesToCut + " cookies were cut into " + aShape);
    super.setCount(cookiesToCut);
  }

  void decorate(){
    if(super.getIsReady()){
      isDecorated = true;
      System.out.println("The cookies were decorated");
    }
    else{
      System.out.println("Make sure to bake the cookies first");
    }

  }


}