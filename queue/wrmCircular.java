public class wrmCircular implements wrmQueue{
    int front;
    int size;
    int capacity = 100;
    int id = 0;
    
    patient[] patientQueue;

    public wrmCircular(){
        patientQueue = new patient[capacity];
        front = 0;
        size = 0;
    }

    public void RegisterPatient(patient p) throws QueueOverflowException{
        if(size == capacity)
            throw new QueueOverflowException();
        else{
            id++;
            p.id = id;
            patientQueue[(front + size)%capacity] = p;
            size++;
            System.out.println("Patient " + p.name + " Registered to the system with id no: " + p.id + " . Please wait in Queue.");
        }
    }

    public void ServePatient() throws QueueUnderflowException{
        if(size > 0){
            patient currentPatient = patientQueue[front];
            int id = currentPatient.id;
            String name = currentPatient.name;
            patientQueue[front] = null;
            front = (front + 1)%capacity;
            size--;
            System.out.println("Calling Mr./Mrs. " + name + " (Serial No. " + id + ") for service.");
        }
        else throw new QueueUnderflowException();
    }

    public void CancelAll(){
        while(size > 0){
            patient currentPatient = patientQueue[front];
            int id = currentPatient.id;
            String name = currentPatient.name;
            patientQueue[front] = null;
            front = (front + 1)%capacity;
            size--;
            System.out.println("Sorry, Mr./Mrs. " + name + " (Serial No. " + id + ") we have to cancel our appointment due to lunch break.");
        }
    }
    public boolean CanDoctorGoHome(){
        if(size == 0)
            return true;
        else
            return false;
    }
    public void ShowAllPatientsOld(){
        System.out.println("--------------------------------------");
        System.out.println("Showing All Patients: ");
        int j = front;
        for(int i = 0; i < size; i++){
            patient currentPatient = patientQueue[j];
            System.out.println("--------------");
            System.out.println("Patient Name: " + currentPatient.name);
            System.out.println("age: " + currentPatient.age);
            System.out.println("Blood Group: " + currentPatient.bg);
            System.out.println("ID: " + currentPatient.id);
            j = (j + 1)%capacity;
        }
        System.out.println("--------------------------------------");
    }
    public void ShowAllPatients(){
        patient[] sorted;
        sorted = new patient[size];
        int j = front;
        for(int i = 0; i < size; i++){
            sorted[i] = patientQueue[j];
            j = (j+1)%capacity;
        }

        for(int i = 0; i < size; i++){
            int min_idx = i;
            for(j = i + 1; j < size; j++){
                if((sorted[j].name.compareTo(sorted[min_idx].name)) < 0)
                    min_idx = j;
            }
            patient temp = sorted[min_idx];
            sorted[min_idx] = sorted[i];
            sorted[i] = temp;
        }

        System.out.println("--------------------------------------");
        System.out.println("Showing All Patients: ");
        for(int i = 0; i < size; i++){
            patient currentPatient = sorted[i];
            System.out.println("--------------");
            System.out.println("Patient Name: " + currentPatient.name);
            System.out.println("age: " + currentPatient.age);
            System.out.println("Blood Group: " + currentPatient.bg);
            System.out.println("ID: " + currentPatient.id);
        }
        System.out.println("--------------------------------------");


    }
}