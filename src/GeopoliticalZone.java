public enum GeopoliticalZone {

    NORTHCENTRAL("Benue","FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateu"),
    NORTHEAST("Adamawa","Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTHWEST("Kaduna","Kastina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTHEAST("Abia","Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTHSOUTH("Akwa-Ibom","Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    SOUTHWEST("Ekiti","Lagos", "Osun", "Ondo", "Ogun", "Oyo");


    private String[] Geopolitical;
    GeopoliticalZone(String...Geopolitical){
        this.Geopolitical = Geopolitical;
    }

    public String[] getGeopolitical(){
        return Geopolitical;
    }
    public void setGeopolitical(String...Geopolitical){
        this.Geopolitical = Geopolitical;
    }
}
