public class UserGreeting {
    private final UserProfiles profiles; //Dependencia de la clase UserProfiles

    public UserGreeting(UserProfiles profiles){
        this.profiles = profiles;
    }

    public String formatGreeting(UserId id){
        return String.format("Hola y bienvenido, %s",profiles.fetchNicknameFor(id));
    }
}
