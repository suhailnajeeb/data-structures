class testWRM{
    public static void main(String args[]) throws Exception{
        patient p1 = new patient("Xavier", 23, "AB-ve");
        patient p2 = new patient("Barack", 18, "O+ve");
        patient p3 = new patient("Donald", 24, "AB+ve");
        patient p4 = new patient("Alexander", 17, "A+ve");
        patient p5 = new patient("Charles", 22, "B+ve");


        wrmCircular wrm = new wrmCircular();
        wrm.RegisterPatient(p1);
        wrm.RegisterPatient(p2);

        wrm.ServePatient();

        wrm.RegisterPatient(p3);
        wrm.RegisterPatient(p4);
        wrm.RegisterPatient(p5);

        wrm.ShowAllPatients();

        wrm.ServePatient();
        wrm.CancelAll();

        if(wrm.CanDoctorGoHome())
            System.out.println("No more patients, The doctor can go home.");

    }
}