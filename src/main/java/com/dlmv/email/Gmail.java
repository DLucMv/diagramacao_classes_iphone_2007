package com.dlmv.email;

public class Gmail implements Email{

    public void enviarEmail(){
        System.out.println("Enviando e-mail via Gmail...");
    }

    public void responderEmail(){
        System.out.println("Respondendo e-mail via Gmail...");
    }

    public void apagarEmail(){
        System.out.println("Apagando e-mail via Gmail...");
    }

}
