public class PasswordValidator {
    public String validate(String password){

     if(password.length()<8){
         return "La contraseña debe de contener al menos 8 letras";
     }

     if(password.toLowerCase().equals(password)){
         return  "La contraseña debe de contener al menos una letra mayúscula.";
     }

     if(password.toUpperCase().equals(password)){
         return "La contraseña debe de contener al menos una letra minúscula.";
     }

     if(!password.matches(".*\\d.*")) {
         return "La contraseña debe contener al menos un dígito.";
     }

     if (!password.matches(".*[!@#$%^&*()].")){
         return "La contraseña debe contener al menos un carácter especial.";
     }

        return password;
    }
}

