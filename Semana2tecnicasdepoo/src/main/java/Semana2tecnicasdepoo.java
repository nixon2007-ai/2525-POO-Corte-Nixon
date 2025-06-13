public class Semana2tecnicasdepoo {
    // ==========================
    // 1. Ejemplo de Abstracción
    // ==========================
    abstract static class Vehiculo {
        private String marca;

        public Vehiculo(String marca) {
            this.marca = marca;
        }

        public String getMarca() {
            return marca;
        }

        public abstract void conducir();
    }

    static class Coche extends Vehiculo {
        public Coche(String marca) {
            super(marca);
        }

        @Override
        public void conducir() {
            System.out.println("Conduciendo el coche: " + getMarca());
        }
    }

    // ============================
    // 2. Ejemplo de Encapsulación
    // ============================
    static class Mantenimiento {
        private String tipo;
        private double costo;

        public Mantenimiento(String tipo, double costo) {
            this.tipo = tipo;
            this.costo = costo;
        }

        public void setCosto(double nuevoCosto) {
            if (nuevoCosto > 0) {
                costo = nuevoCosto;
            }
        }

        public double getCosto() {
            return costo;
        }

        public String getTipo() {
            return tipo;
        }
    }

    // ========================
    // 3. Ejemplo de Herencia
    // ========================
    static class VehiculoPesado {
        String tipo;

        public VehiculoPesado(String tipo) {
            this.tipo = tipo;
        }

        public void mostrarTipo() {
            System.out.println("Tipo de vehículo pesado: " + tipo);
        }
    }

    static class Camion extends VehiculoPesado {
        String carga;

        public Camion(String tipo, String carga) {
            super(tipo);
            this.carga = carga;
        }

        public void mostrarCarga() {
            System.out.println("Carga del camión: " + carga);
        }
    }

    // ==========================
    // 4. Ejemplo de Polimorfismo
    // ==========================
    static class Servicio {
        public void realizarServicio() {
            System.out.println("Servicio genérico realizado...");
        }
    }

    static class ServicioLavado extends Servicio {
        @Override
        public void realizarServicio() {
            System.out.println("Realizando lavado del vehículo.");
        }
    }

    static class ServicioReparacion extends Servicio {
        @Override
        public void realizarServicio() {
            System.out.println("Realizando reparación del vehículo.");
        }
    }

    // ==================
    // Método Principal
    // ==================
    public static void main(String[] args) {
        // Abstracción
        Vehiculo miCoche = new Coche("Toyota Corolla");
        miCoche.conducir();

        // Encapsulación
        Mantenimiento mantenimiento = new Mantenimiento("Cambio de aceite", 150.00);
        mantenimiento.setCosto(120.00);
        System.out.println("Mantenimiento: " + mantenimiento.getTipo() + " - Costo: $" + mantenimiento.getCosto());

        // Herencia
        Camion camion = new Camion("Camión de carga", "Materiales de construcción");
        camion.mostrarTipo();
        camion.mostrarCarga();

        // Polimorfismo
        Servicio servicio1 = new ServicioLavado();
        Servicio servicio2 = new ServicioReparacion();
        servicio1.realizarServicio(); // Servicio de lavado
        servicio2.realizarServicio(); // Servicio de reparación
    }
}