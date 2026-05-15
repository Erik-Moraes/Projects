package dominio;

public class Smartphone {

    String marca;
    String serialNumber;

    public Smartphone(String marca, String serialNumber) {
        this.marca = marca;
        this.serialNumber = serialNumber;
    }


    //Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    //Simetrico: para x e y diferentes de null, se x.equals(y) == ture logo, y.equals(x) == true
    //Transitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true logo, y.equals(z) == true
    //Consistente: x.equals(x) sempre retorna true se x for diferente de null
    //para x diferente de null, x.equals(null) tem que retornar false.

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber) && marca.equals(smartphone.marca);
    }


    //Se x.equals (y) == true, y.hashCode() == x.hashCode ()
    // y.hashCode == x.hashCode () não necessariamente o equals de y.equals (x) tem que ser true
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "marca='" + marca + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
