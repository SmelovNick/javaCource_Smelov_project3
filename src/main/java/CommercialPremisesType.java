public enum CommercialPremisesType {
    SHOP("магазин"),
    WAREHOUSE("склад"),
    OFFICE("офис");

    private String type;

    CommercialPremisesType(String type){
        this.type = type;
    }

    public String getType(){return this.type;}
}
