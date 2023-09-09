public enum Gender {
    FEMALE,
    MALE;

    public static Gender fromString(String genderStr) {
        switch (genderStr) {
            case "male":
                return MALE;
            case "female":
                return FEMALE;
            default:
                return null;
        }
    }
}
