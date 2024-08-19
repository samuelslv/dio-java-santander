package componentes.phone;

public class Telefone implements AparelhoTelefonico{

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("ligando");
        //throw new UnsupportedOperationException("Unimplemented method 'TELEFNOE ligar'");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("atendedo");
        //throw new UnsupportedOperationException("Unimplemented method 'TELEFNOE atender'");
    }

    @Override
    public void iniciarCorrerioVoz() {
        // TODO Auto-generated method stub
        System.out.println("correio de voz");
        //throw new UnsupportedOperationException("Unimplemented method 'TELEFNOE iniciarCorrerioVoz'");
    }
    
}
