class Bus {
    private int number;
    private Person[] passenger;

  public Bus(int number){
    this.number = number;
    this.passenger = new Person[5];
  }

  public int getNumber(){
    return this.number;
  }

  public int passengerCount() {
    int count = 0;
    for (Person person : passenger) {
      if (person != null) {
        count++;
      }
    }
    return count;
  }
}
