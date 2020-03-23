
public interface wrmQueue{
   

    void RegisterPatient(patient p) throws QueueOverflowException;
    void ServePatient() throws QueueUnderflowException;

}



