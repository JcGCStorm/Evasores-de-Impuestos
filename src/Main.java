import java.util.List;     
     /**
      * Clase Main, le dice que hacer a nuestra simulación.
      */   
public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){

      
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
        hvoNormal.agregar(alicia);
        memeflixCuatro.agregar(alicia);
        momazonPremium.agregar(alicia);
        thisneyNormal.agregar(alicia);
        spootifyPremium.agregar(alicia);

        /**
         * Agregamos los servicios de Bob.
         */
        hvoNormal.agregar(bob);
        memeflixCuatro.agregar(bob);
        momazonPremium.agregar(bob);
        thisneyNormal.agregar(bob);
        spootifyPremium.agregar(bob);

        /**
         * Agregamos los servicios de César.
         */
        hvoNormal.agregar(cesar);
        thisneyNormal.agregar(cesar);
        
        /**
         * Agregamos los servicios de Diego.
         */
        hvoNormal.agregar(diego);
        momazonPremium.agregar(diego);
        spootifyGratis.agregar(diego);

        /**
         * Agregamos los servicios de Erika
         */
        memeflixCuatro.agregar(erika);
        spootifyGratis.agregar(erika);
        hvoNormal.agregar(erika);

        /**
         * Agregamos los servicios de Fausto.
         */
        thisneyNormal.agregar(fausto);
        hvoNormal.agregar(fausto);

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

         List listaThisneyN = thisneyNormal.getUsuarios();
         List listaThisney3M = thisney3meses.getUsuarios();

         List listaSpootiPremium = spootifyPremium.getUsuarios();
         List listaSpootiGratis = spootifyGratis.getUsuarios();

        /**
         * Primer mes.
         */
         System.out.println("################### Primer mes #########################\n");

         System.out.println("--------------------------HVO_MAX-----------------------------");
        hvoNormal.procesarUsuarios(listahvoNormal);
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
        thisneyNormal.procesarUsuarios(listaThisneyN);
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
        hvoNormal.procesarUsuarios(listahvoNormal);
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
        thisneyNormal.procesarUsuarios(listaThisneyN);
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
        hvoNormal.procesarUsuarios(listahvoNormal);
        hvoGratis.procesarUsuarios(listahvoGratis);
        // Erika cancela su subscripción de HVO_MAX
        hvoNormal.eliminar(erika);
        // Bob cancela su subscripción de HVO_MAX
        hvoNormal.eliminar(bob);
        // Fausto cancela su subscripción de HVO_MAX
        hvoNormal.eliminar(fausto);

        System.out.println("\n\n");

        System.out.println("-----------------------------Memeflix--------------------------------");
        memeflixCuatro.procesarUsuarios(listaMeme4);
        memeflixDos.procesarUsuarios(listaMeme2);
        memeflixSolo.procesarUsuarios(listaMeme);
        // Fausto contrata Memeflix para un dispositivo
        memeflixSolo.agregar(fausto);

        System.out.println("\n\n");

        System.out.println("-----------------------------Momazon--------------------------------");

        momazonPremium.procesarUsuarios(listaMomazonP);
        momazonNormal.procesarUsuarios(listaMomazonN);

        System.out.println("\n\n");

        System.out.println("-----------------------------Thisney--------------------------------");
        thisneyNormal.procesarUsuarios(listaThisneyN);
        thisney3meses.procesarUsuarios(listaThisney3M);
        // Erika contrata Thisney
        thisneyNormal.agregar(erika);
        // Bob se da de baja de Thisney
        thisneyNormal.eliminar(bob);
        // Fausto se da de baja de Thisney
        thisneyNormal.eliminar(fausto);

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
        hvoNormal.procesarUsuarios(listahvoNormal);
        hvoGratis.procesarUsuarios(listahvoGratis);

        System.out.println("\n\n");

        System.out.println("-----------------------------Memeflix--------------------------------");
        memeflixCuatro.procesarUsuarios(listaMeme4);
        memeflixDos.procesarUsuarios(listaMeme2);
        memeflixSolo.procesarUsuarios(listaMeme);
        // Bob se da de baja de Memeflix
        memeflixCuatro.eliminar(bob);

        System.out.println("\n\n");

        System.out.println("-----------------------------Momazon--------------------------------");

        momazonPremium.procesarUsuarios(listaMomazonP);
        momazonNormal.procesarUsuarios(listaMomazonN);
        // Bob se da de baja de Momazon
        momazonPremium.eliminar(bob);

        System.out.println("\n\n");

        System.out.println("-----------------------------Thisney--------------------------------");
        thisneyNormal.procesarUsuarios(listaThisneyN);
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
        hvoNormal.procesarUsuarios(listahvoNormal);
        hvoGratis.procesarUsuarios(listahvoGratis);
        // Fausto vuelve a contratar HVO_MAX
        hvoNormal.agregar(fausto);

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
        thisneyNormal.procesarUsuarios(listaThisneyN);
        thisney3meses.procesarUsuarios(listaThisney3M); 
        //Fausto vuelve a contratar Thisney
        thisneyNormal.agregar(fausto);

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
        hvoNormal.procesarUsuarios(listahvoNormal);
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
        thisneyNormal.procesarUsuarios(listaThisneyN);
        thisney3meses.procesarUsuarios(listaThisney3M);
        // Diego se suscribe a Thisney

        System.out.println("\n\n");

        System.out.println("-----------------------------Spootify--------------------------------");
        spootifyPremium.procesarUsuarios(listaSpootiPremium);
        spootifyGratis.procesarUsuarios(listaSpootiGratis);
        System.out.println("\n\n");


         /**
         * Septimo mes.
         */


         /**
         * Octavo mes.
         */


         /**
         * Noveno mes.
         */

         /**
         * Decimo mes.
         */

    }
}
