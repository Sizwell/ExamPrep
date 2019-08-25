package za.ac.cput.payroll.Domain.Race;

public class Race {

    private String raceID;
    private String empRace;

    public Race()
    {

    }

    public Race(Builder builder)
    {
        this.raceID = builder.raceID;
        this.empRace = builder.emRace;
    }

    public static class Builder
    {
        private String raceID;
        private String emRace;

        public Builder raceID(String rID)
        {
            this.raceID = rID;
            return this;
        }

        public Builder empRace(String empRace)
        {
            this.emRace = empRace;
            return this;
        }

        public Builder copy(Race race)
        {
            this.raceID = race.raceID;
            this.emRace = race.empRace;
            return this;
        }

        public Race builder()
        {
            return new Race(this);
        }

    }

    public String getRaceID()
    {
        return this.raceID;
    }

    public String getEmpRace()
    {
        return this.empRace;
    }

    public String toString()
    {
        return "Race ID: " + getRaceID() + " Employee race " + getEmpRace();
    }

}
