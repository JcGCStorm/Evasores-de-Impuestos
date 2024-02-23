import java.util.List;     
import java.io.FileOutputStream;
import java.io.PrintStream;
     /**
      * Clase Main, le dice que hacer a nuestra simulación.
      */   
public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){

        PrintStream stdout = System.out;
        try {

            FileOutputStream fileOutputStream = new FileOutputStream("Simulacion.txt");
            PrintStream printStream = new PrintStream(fileOutputStream);
            System.setOut(printStream);
     /**
      * Creación de los usuarios para la simulación.
      */
       Usuario alicia = new Usuario("Alicia", 15000, new int[]{0,0,0,0,0});
       Usuario bob = new Usuario("Bob", 2400, new int[]{0,0,0,0,0}); 
       Usuario cesar = new Usuario("César", 5000, new int[]{0,0,0,0,0}); 
       Usuario diego = new Usuario("Diego", 9000, new int[]{0,0,0,0,0});
       Usuario erika = new Usuario("Erika", 10000, new int[]{0,0,0,0,0});
       Usuario fausto = new Usuario("Fausto", 5000, new int[]{0,0,0,0,0});

       /**
        * Creación de los paquetes de los servicios para la implementación.
        */
       HVO_MAXPaqueteNormal hvoNormal= new HVO_MAXPaqueteNormal(0);
       HVO_MAXPaqueteGratis hvoGratis = new HVO_MAXPaqueteGratis(0);

       MemeflixPaqueteCuatro memeflixCuatro = new MemeflixPaqueteCuatro(0);
       MemeflixPaqueteDos    memeflixDos    = new MemeflixPaqueteDos(0);
       MemeflixPaqueteSolo   memeflixSolo   = new MemeflixPaqueteSolo(0);

       MomazonPaquetePremium momazonPremium = new MomazonPaquetePremium(0);
       MomazonPaqueteNormal momazonNormal = new MomazonPaqueteNormal(0);

       ThisneyPaqueteNormal thisneyNormal = new ThisneyPaqueteNormal(0);
       ThisneyPaqueteTresMeses thisney3meses = new ThisneyPaqueteTresMeses(0);

       SpootifyPaquetePremium spootifyPremium = new SpootifyPaquetePremium(0);
       SpootifyPaqueteGratis  spootifyGratis  = new SpootifyPaqueteGratis(0);

       /**
        * Comenzamos la simulación. Agregamos los servicios de Alicia
        */
        hvoGratis.agregar(alicia);
        memeflixCuatro.agregar(alicia);
        momazonPremium.agregar(alicia);
        thisney3meses.agregar(alicia);
        spootifyPremium.agregar(alicia);

        /**
         * Agregamos los servicios de Bob.
         */
        hvoGratis.agregar(bob);
        memeflixCuatro.agregar(bob);
        momazonPremium.agregar(bob);
        thisney3meses.agregar(bob);
        spootifyPremium.agregar(bob);

        /**
         * Agregamos los servicios de César.
         */
        hvoGratis.agregar(cesar);
        thisney3meses.agregar(cesar);
        
        /**
         * Agregamos los servicios de Diego.
         */
        hvoGratis.agregar(diego);
        momazonPremium.agregar(diego);
        spootifyGratis.agregar(diego);

        /**
         * Agregamos los servicios de Erika
         */
        memeflixCuatro.agregar(erika);
        spootifyGratis.agregar(erika);
        hvoGratis.agregar(erika);

        /**
         * Agregamos los servicios de Fausto.
         */
        thisney3meses.agregar(fausto);
        hvoGratis.agregar(fausto);

        /**
         * Obtenemos las listas de los usuarios que contrataron los servicios.
         */

        List listahvoNormal = hvoNormal.getUsuarios();
         List listahvoGratis = hvoGratis.getUsuarios();

         List listaMeme4 = memeflixCuatro.getUsuarios();
         List listaMeme2 = memeflixDos.getUsuarios();
         List listaMeme = memeflixSolo.getUsuarios();

         List listaMomazonP = momazonPremium.getUsuarios();
         List listaMomazonN = momazonNormal.getUsuarios();

         List listaThisneyN = thisney3meses.getUsuarios();
         List listaThisney3M = thisney3meses.getUsuarios();

         List listaSpootiPremium = spootifyPremium.getUsuarios();
         List listaSpootiGratis = spootifyGratis.getUsuarios();

        /**
         * Primer mes.
         */
         System.out.println("################### Primer mes #########################\n");

         System.out.println("--------------------------HVO_MAX-----------------------------");
        hvoGratis.procesarUsuarios(listahvoGratis);

        System.out.println("\n\n");

        System.out.println("-----------------------------Memeflix--------------------------------");
        memeflixCuatro.procesarUsuarios(listaMeme4);
        memeflixDos.procesarUsuarios(listaMeme2);
        memeflixSolo.procesarUsuarios(listaMeme);

        System.out.println("\n\n");

        System.out.println("-----------------------------Momazon--------------------------------");

        momazonPremium.procesarUsuarios(listaMomazonP);
        momazonNormal.procesarUsuarios(listaMomazonN);

        System.out.println("\n\n");

        System.out.println("----------------------------- Thisney  ------------------------------");
        thisney3meses.procesarUsuarios(listaThisney3M);

        System.out.println("\n\n");

        System.out.println("-----------------------------Spootify--------------------------------");
        spootifyPremium.procesarUsuarios(listaSpootiPremium);
        spootifyGratis.procesarUsuarios(listaSpootiGratis);
        System.out.println("\n\n");

         /**
         * Segundo mes.
         */

         System.out.println("################### Segundo mes #########################\n");

         System.out.println("--------------------------HVO_MAX-----------------------------");
        hvoGratis.procesarUsuarios(listahvoGratis);

        System.out.println("\n\n");

        System.out.println("-----------------------------Memeflix--------------------------------");
        memeflixCuatro.procesarUsuarios(listaMeme4);
        memeflixDos.procesarUsuarios(listaMeme2);
        memeflixSolo.procesarUsuarios(listaMeme);

        System.out.println("\n\n");

        System.out.println("-----------------------------Momazon--------------------------------");

        momazonPremium.procesarUsuarios(listaMomazonP);
        momazonNormal.procesarUsuarios(listaMomazonN);

        System.out.println("\n\n");

        System.out.println("-----------------------------Thisney--------------------------------");
        thisney3meses.procesarUsuarios(listaThisney3M);

        System.out.println("\n\n");

        System.out.println("-----------------------------Spootify--------------------------------");
        spootifyPremium.procesarUsuarios(listaSpootiPremium);
        spootifyGratis.procesarUsuarios(listaSpootiGratis);
        System.out.println("\n\n");


         /**
         * Tercer mes.
         */

         System.out.println("################### Tercer mes #########################\n");

         System.out.println("--------------------------HVO_MAX-----------------------------");
         // Erika cancela su subscripción de HVO_MAX

        hvoGratis.eliminar(erika);
        // Bob cancela su subscripción de HVO_MAX
        hvoGratis.eliminar(bob);
        // Fausto cancela su subscripción de HVO_MAX

        hvoGratis.eliminar(fausto);
        hvoGratis.procesarUsuarios(listahvoGratis);
        

        System.out.println("\n\n");

        System.out.println("-----------------------------Memeflix--------------------------------");
        // Fausto contrata Memeflix para un dispositivo
        memeflixSolo.agregar(fausto);
        memeflixCuatro.procesarUsuarios(listaMeme4);
        memeflixDos.procesarUsuarios(listaMeme2);
        memeflixSolo.procesarUsuarios(listaMeme);

        System.out.println("\n\n");

        System.out.println("-----------------------------Momazon--------------------------------");

        momazonPremium.procesarUsuarios(listaMomazonP);
        momazonNormal.procesarUsuarios(listaMomazonN);

        System.out.println("\n\n");

        System.out.println("-----------------------------Thisney--------------------------------");
        // Erika contrata Thisney
        thisney3meses.agregar(erika);
        // Bob se da de baja de Thisney
        thisney3meses.eliminar(bob);
        // Fausto se da de baja de Thisney

        thisney3meses.eliminar(fausto);
        thisney3meses.procesarUsuarios(listaThisney3M);

        System.out.println("\n\n");

        System.out.println("-----------------------------Spootify--------------------------------");
        spootifyPremium.procesarUsuarios(listaSpootiPremium);
        spootifyGratis.procesarUsuarios(listaSpootiGratis);
        System.out.println("\n\n");


         /**
         * Cuarto mes.
         */

         System.out.println("################### Cuarto mes #########################\n");

         System.out.println("--------------------------HVO_MAX-----------------------------");
        hvoGratis.procesarUsuarios(listahvoGratis);

        System.out.println("\n\n");

        System.out.println("-----------------------------Memeflix--------------------------------");
        // Bob se da de baja de Memeflix
        memeflixCuatro.eliminar(bob);
        memeflixCuatro.procesarUsuarios(listaMeme4);
        memeflixDos.procesarUsuarios(listaMeme2);
        memeflixSolo.procesarUsuarios(listaMeme);

        System.out.println("\n\n");

        System.out.println("-----------------------------Momazon--------------------------------");
         // Bob se da de baja de Momazon
         momazonPremium.eliminar(bob);
        momazonPremium.procesarUsuarios(listaMomazonP);
        momazonNormal.procesarUsuarios(listaMomazonN);

        System.out.println("\n\n");

        System.out.println("-----------------------------Thisney--------------------------------");
        thisney3meses.procesarUsuarios(listaThisney3M);

        System.out.println("\n\n");

        System.out.println("-----------------------------Spootify--------------------------------");
        spootifyPremium.procesarUsuarios(listaSpootiPremium);
        spootifyGratis.procesarUsuarios(listaSpootiGratis);
        System.out.println("\n\n");


         /**
         * Quinto mes.
         */

         System.out.println("################### Quinto mes #########################\n");

         System.out.println("--------------------------HVO_MAX-----------------------------");
         // Fausto vuelve a contratar HVO_MAX

        hvoGratis.agregar(fausto);
        hvoGratis.procesarUsuarios(listahvoGratis);

        System.out.println("\n\n");

        System.out.println("-----------------------------Memeflix--------------------------------");
        memeflixCuatro.procesarUsuarios(listaMeme4);
        memeflixDos.procesarUsuarios(listaMeme2);
        memeflixSolo.procesarUsuarios(listaMeme);

        System.out.println("\n\n");

        System.out.println("-----------------------------Momazon--------------------------------");

        momazonPremium.procesarUsuarios(listaMomazonP);
        momazonNormal.procesarUsuarios(listaMomazonN);

        System.out.println("\n\n");

        System.out.println("-----------------------------Thisney--------------------------------");
        //Fausto vuelve a contratar Thisney

        thisney3meses.agregar(fausto);

        thisney3meses.procesarUsuarios(listaThisney3M); 

        System.out.println("\n\n");

        System.out.println("-----------------------------Spootify--------------------------------");
        spootifyPremium.procesarUsuarios(listaSpootiPremium);
        spootifyGratis.procesarUsuarios(listaSpootiGratis);
        System.out.println("\n\n");


         /**
         * Sexto mes.
         */
        System.out.println("################### Sexto mes #########################\n");

         System.out.println("--------------------------HVO_MAX-----------------------------");
         // Fausto cancela HVO_MAX
        hvoGratis.eliminar(fausto);
        hvoGratis.procesarUsuarios(listahvoGratis);
        System.out.println("\n\n");

        System.out.println("-----------------------------Memeflix--------------------------------");
        // Erika cancela Memeflix
        memeflixCuatro.eliminar(erika);
        // Fausto cancela Memeflix
        memeflixSolo.eliminar(fausto);
        memeflixCuatro.procesarUsuarios(listaMeme4);
        memeflixDos.procesarUsuarios(listaMeme2);
        memeflixSolo.procesarUsuarios(listaMeme);


        System.out.println("\n\n");

        System.out.println("-----------------------------Momazon--------------------------------");

        momazonPremium.procesarUsuarios(listaMomazonP);
        momazonNormal.procesarUsuarios(listaMomazonN);

        System.out.println("\n\n");

        System.out.println("-----------------------------Thisney--------------------------------");
        // Diego se suscribe a Thisney

        thisney3meses.agregar(diego);
        // Erika cancela Thisney
        thisney3meses.eliminar(erika);
        // Fausto cancela Thisney
        thisney3meses.eliminar(fausto);
        thisney3meses.procesarUsuarios(listaThisney3M);

        System.out.println("\n\n");

        System.out.println("-----------------------------Spootify--------------------------------");
        // Erika cancela Spootify
        spootifyGratis.eliminar(erika);
        spootifyPremium.procesarUsuarios(listaSpootiPremium);
        spootifyGratis.procesarUsuarios(listaSpootiGratis);
        
        System.out.println("\n\n");


         /**
         * Septimo mes.
         */

         System.out.println("################### Septimo mes #########################\n");

         System.out.println("--------------------------HVO_MAX-----------------------------");

        hvoGratis.procesarUsuarios(listahvoGratis);

        System.out.println("\n\n");

        System.out.println("-----------------------------Memeflix--------------------------------");
        // Diego se suscribe a Memeflix para un dispositivo
        memeflixSolo.agregar(diego);
        memeflixCuatro.procesarUsuarios(listaMeme4);
        memeflixDos.procesarUsuarios(listaMeme2);
        memeflixSolo.procesarUsuarios(listaMeme);

        System.out.println("\n\n");

        System.out.println("-----------------------------Momazon--------------------------------");
        // Diego cancela su subscripcion de Momazon premium
        momazonPremium.eliminar(diego);
        momazonPremium.procesarUsuarios(listaMomazonP);
        momazonNormal.procesarUsuarios(listaMomazonN);

        System.out.println("\n\n");

        System.out.println("-----------------------------Thisney--------------------------------");
        thisney3meses.procesarUsuarios(listaThisney3M);

        System.out.println("\n\n");

        System.out.println("-----------------------------Spootify--------------------------------");
        // Cesar contrata SpootifyPremium
        spootifyPremium.agregar(cesar);
        // Diego cambia a la versión premium de spootify
        spootifyGratis.eliminar(diego);
        diego.cambiarVersion();
        spootifyPremium.agregar(diego);

        spootifyPremium.procesarUsuarios(listaSpootiPremium);
        spootifyGratis.procesarUsuarios(listaSpootiGratis);
        System.out.println("\n\n");

         /**
         * Octavo mes.
         */

         System.out.println("################### Octavo mes #########################\n");

         System.out.println("--------------------------HVO_MAX-----------------------------");
        hvoGratis.procesarUsuarios(listahvoGratis);

        System.out.println("\n\n");

        System.out.println("-----------------------------Memeflix--------------------------------");
        memeflixCuatro.procesarUsuarios(listaMeme4);
        memeflixDos.procesarUsuarios(listaMeme2);
        memeflixSolo.procesarUsuarios(listaMeme);

        System.out.println("\n\n");

        System.out.println("-----------------------------Momazon--------------------------------");

        momazonPremium.procesarUsuarios(listaMomazonP);
        momazonNormal.procesarUsuarios(listaMomazonN);

        System.out.println("\n\n");

        System.out.println("-----------------------------Thisney--------------------------------");
        thisney3meses.procesarUsuarios(listaThisney3M);
        System.out.println("\n\n");

        System.out.println("-----------------------------Spootify--------------------------------");
        spootifyPremium.procesarUsuarios(listaSpootiPremium);
        spootifyGratis.procesarUsuarios(listaSpootiGratis);
        System.out.println("\n\n");

         /**
         * Noveno mes.
         */

         System.out.println("################### Noveno mes #########################\n");

         System.out.println("--------------------------HVO_MAX-----------------------------");
        hvoGratis.procesarUsuarios(listahvoGratis);
        System.out.println("\n\n");

        System.out.println("-----------------------------Memeflix--------------------------------");
        memeflixCuatro.procesarUsuarios(listaMeme4);
        memeflixDos.procesarUsuarios(listaMeme2);
        memeflixSolo.procesarUsuarios(listaMeme);

        System.out.println("\n\n");

        System.out.println("-----------------------------Momazon--------------------------------");

        momazonPremium.procesarUsuarios(listaMomazonP);
        momazonNormal.procesarUsuarios(listaMomazonN);

        System.out.println("\n\n");

        System.out.println("-----------------------------Thisney--------------------------------");

        thisney3meses.procesarUsuarios(listaThisney3M);

        System.out.println("\n\n");

        System.out.println("-----------------------------Spootify--------------------------------");
        spootifyPremium.procesarUsuarios(listaSpootiPremium);
        spootifyGratis.procesarUsuarios(listaSpootiGratis);
        System.out.println("\n\n");

         /**
         * Decimo mes.
         */
        System.out.println("################### Decimo mes #########################\n");

        System.out.println("--------------------------HVO_MAX-----------------------------");
        // Erika contrata HVO_MAX
       hvoGratis.agregar(erika);
       hvoGratis.procesarUsuarios(listahvoGratis);

       System.out.println("\n\n");

       System.out.println("-----------------------------Memeflix--------------------------------");
       memeflixCuatro.procesarUsuarios(listaMeme4);
       memeflixDos.procesarUsuarios(listaMeme2);
       memeflixSolo.procesarUsuarios(listaMeme);

       System.out.println("\n\n");

       System.out.println("-----------------------------Momazon--------------------------------");
       // Erika contrata Momazon premium
       momazonPremium.agregar(erika);
       momazonPremium.procesarUsuarios(listaMomazonP);
       momazonNormal.procesarUsuarios(listaMomazonN);

       System.out.println("\n\n");

       System.out.println("-----------------------------Thisney--------------------------------");
       // Erika contrata Thisney
       thisney3meses.agregar(erika);
       thisney3meses.procesarUsuarios(listaThisney3M);

       System.out.println("\n\n");

       System.out.println("-----------------------------Spootify--------------------------------");
       spootifyPremium.procesarUsuarios(listaSpootiPremium);
       spootifyGratis.procesarUsuarios(listaSpootiGratis);
       System.out.println("\n\n");

       System.out.println("Fin de la simulación, despierta.");


   } catch (Exception e) {
        e.printStackTrace();
       } finally {
        System.setOut(stdout);
     }
   }
}