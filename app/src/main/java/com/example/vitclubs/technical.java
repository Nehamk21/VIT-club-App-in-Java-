package com.example.vitclubs;

 class technical {
    String techClubName;
    String description;
    int image;


    public technical(String techClubName, int image, String description) {
        this.techClubName = techClubName;
        this.description = description;
        this.image = image;
    }



    public String getTechClubName() {
        return techClubName;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
