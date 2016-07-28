package es.fabricaweb.www.mitaller.clases;

/**
 * Created by Jorge on 25/07/2016.
 */
public class cUsuario {

    private Integer idUsuario;
    private String usuario;
    private String clave;
    private String dni;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String codigoPostal;
    private String localidad;
    private String provincia;
    private String email;
    private String estado;

    public cUsuario(String apellidos, String clave, String codigoPostal, String direccion, String dni, String email, String estado, Integer idUsuario, String localidad, String nombres, String provincia, String usuario) {
        this.apellidos = apellidos;
        this.clave = clave;
        this.codigoPostal = codigoPostal;
        this.direccion = direccion;
        this.dni = dni;
        this.email = email;
        this.estado = estado;
        this.idUsuario = idUsuario;
        this.localidad = localidad;
        this.nombres = nombres;
        this.provincia = provincia;
        this.usuario = usuario;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
