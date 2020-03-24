public class wrmList implements wrmQueue{
    Node head;
    int size;
    int id = 0;  
    
    public wrmList(){
        head = null;
        size = 0;
    }

    public void RegisterPatient(patient p){
        Node n = head;
        id++;
        p.id = id;
        Node newNode = new Node(p, null);
        if(size == 0)
            head = newNode;
        else{      
            for(int i = 0; i < size - 1; i++)
                n = n.next;
            n.next = newNode;
        }
        size++;
        System.out.println("Patient " + p.name + " Registered to the system with id no: " + p.id + " . Please wait in Queue.");
    }

    public void ServePatient() throws QueueUnderflowException{
        if(size > 0){
            patient currentPatient = head.val;
            head.val = null;
            head = head.next;
            int id = currentPatient.id;
            String name = currentPatient.name;
            size--;
            System.out.println("Calling Mr./Mrs. " + name + " (Serial No. " + id + ") for service.");
        }
        else throw new QueueUnderflowException();
    }

    public void CancelAll(){
        while(size > 0){
            patient currentPatient = head.val;
            head.val = null;
            head = head.next;
            int id = currentPatient.id;
            String name = currentPatient.name;
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

    public void ShowAllPatients(){
        
        for(Node a = head; a != null; a = a.next){
            Node min_node = a;
            for(Node b = a.next; b != null; b = b.next){
                if((b.val.name.compareTo(min_node.val.name))<0)
                    min_node = b;
            }
            patient temp = a.val;
            a.val = min_node.val;
            min_node.val = temp;
        }
        

        System.out.println("--------------------------------------");
        System.out.println("Showing All Patients: ");
        for(Node n = head; n != null; n = n.next){
            patient currentPatient = n.val;
            System.out.println("--------------");
            System.out.println("Patient Name: " + currentPatient.name);
            System.out.println("age: " + currentPatient.age);
            System.out.println("Blood Group: " + currentPatient.bg);
            System.out.println("ID: " + currentPatient.id);
        }
        System.out.println("--------------------------------------");


    }
}