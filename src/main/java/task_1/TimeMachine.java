package task_1;

class TimeMachine {
    int currentYear;
    boolean isWorking;

    TimeMachine(int currentYear, boolean isWorking) {
        this.currentYear = currentYear;
        this.isWorking = isWorking;
    }
    public void traveInTime(TimeTraveler traveler, int inYear){
        if (!isWorking) {
            throw new TimeTravelException("The Time Machine does not working :(");
        } else {
            if (traveler.birthYear > inYear) {
                throw new TimeTravelException("This year " + traveler.name +  " has not yet been born. His year of birth is " + traveler.birthYear);
            } else if (traveler.deathYear < inYear) {
                throw new TimeTravelException("This year " + traveler.name +" is already dead. His year of death is " + traveler.deathYear);
            } else {
                System.out.println(traveler.name + " was moved from " + currentYear + " to " + inYear);
                currentYear = inYear;
            }
        }
    }
}
