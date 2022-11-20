public class Password
  {
    public String password;
    public boolean isValid;
    public String invalidReason;

    public Password()
    {
      this.password = "Abc@123";
      validate();
    }

    public Password(String pass)
    {
      this.password = pass;
      validate();
    }

    public boolean isValid()
    {
        return isValid;
    }

    public String getInvalidReason()
    {
        return invalidReason;
    }

    public void validate()
    {
      isValid = true;
      if(password.length() <= 5)
      {
        isValid  = false;
        invalidReason = "too short, ";

      }
      else if(password.length() >= 17)
      {
        isValid = false;
        invalidReason = "too long, ";
      }
      boolean hasUpper = false;
      boolean hasLower = false;
      boolean hasSpace = false;
      boolean hasDigit = false;
      boolean hasChar  = false;
      for(int i = 0; i < password.length(); i++)
      {
        char c = password.charAt(i);
        if(c >= 65 && c <= 90)
        {
            hasUpper = true;
        }
        else if (c == ' ')
        {
            hasSpace = true;
        }
        else if(c >= 97 && c<= 122)
        {
            hasLower = true;
        }
        else if(c>=48 & c<= 57)
        {
            hasDigit = true;

        }
        else if((c>=33 && c<=47) || (c>=58 && c<64) || (c>= 91 && c<= 96))
        {
            hasChar = true;
        }

        if(hasSpace)
        {
            isValid = false;
            invalidReason += "contains space, ";
        }
        
        if(!hasUpper)
        {
            isValid = false;
            invalidReason += "no uppercase letter, ";
        }
        if(!hasLower)
        {
            isValid = false;
            invalidReason += "no lowercase letter, ";
        }
        if(!hasDigit)
        {
            isValid = false;
            invalidReason += "no digit, ";
        }
        if(!hasChar)
        {
            isValid = false;
            invalidReason += "no special character, ";
        }
      }
    }
  }
