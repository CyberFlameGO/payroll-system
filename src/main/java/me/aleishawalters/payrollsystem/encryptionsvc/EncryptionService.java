package me.aleishawalters.payrollsystem.encryptionsvc;

import me.aleishawalters.payrollsystem.encryptionsvc.helper.EncryptionHelper;
import org.springframework.stereotype.Service;

@Service
public class EncryptionService
{
    public String generateHashedPassword(String password)
    {
        return EncryptionHelper.hash(password);
    }

    public boolean authenticatePassword(String password, String hashedPassword)
    {
        return EncryptionHelper.verify(password, hashedPassword);
    }
}
