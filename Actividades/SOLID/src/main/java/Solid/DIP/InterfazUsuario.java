package Solid.DIP;

class InterfazUsuario {
   // Completa
   BaseDatos basedatos;
    public InterfazUsuario(BaseDatos basedatos) {
        this.basedatos = basedatos;
    }

    public void saveEmployeeId(String empId) {
        basedatos.saveEmpIdInDatabase(empId);
    }
    
    public void setDatabase(BaseDatos basedatos) {
        this.basedatos = basedatos;
    }
}
