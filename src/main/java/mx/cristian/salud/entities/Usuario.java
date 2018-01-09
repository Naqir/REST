package mx.cristian.salud.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "usuario", catalog = "saluddatos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findById", query = "SELECT u FROM Usuario u WHERE u.id = :id")
    , @NamedQuery(name = "Usuario.findByUsuario", query = "SELECT u FROM Usuario u WHERE u.usuario = :usuario")
    , @NamedQuery(name = "Usuario.findByPin", query = "SELECT u FROM Usuario u WHERE u.pin = :pin")    
    , @NamedQuery(name = "Usuario.findByPassword", query = "SELECT u FROM Usuario u WHERE u.password = :password")
    , @NamedQuery(name = "Usuario.findByUserPass", query = "SELECT u FROM Usuario u WHERE u.password = :password AND u.usuario = :usuario ")
    ,@NamedQuery(name = "Usuario.findConsul", query = "SELECT u FROM Usuario u WHERE u.password = :password AND u.usuario = :usuario")
    ,@NamedQuery(name = "Usuario.findConsulta1", query = "SELECT u.consulta1 FROM Usuario u WHERE u.usuario = :usuario")

    , @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Usuario.findByApellido", query = "SELECT u FROM Usuario u WHERE u.apellido = :apellido")
    , @NamedQuery(name = "Usuario.findByEdad", query = "SELECT u FROM Usuario u WHERE u.edad = :edad")
    , @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email")
    , @NamedQuery(name = "Usuario.findBySexo", query = "SELECT u FROM Usuario u WHERE u.sexo = :sexo")})
public class Usuario implements Serializable {

    @Size(max = 800)
    @Column(name = "sensor")
    private String sensor;
   

    @Size(max = 255)
    @Column(name = "pin")
    private String pin;

       private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "usuario", nullable = false, length = 255)
    private String usuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "password", nullable = false, length = 255)
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nombre", nullable = false, length = 255)
    private String nombre;
    @Size(max = 255)
    @Column(name = "apellido", length = 255)
    private String apellido;
    @Column(name = "edad")
    private Integer edad;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "email", nullable = false, length = 255)
    private String email;
    @Size(max = 255)
    @Column(name = "sexo", length = 255)
    private String sexo;
    
     @Size(max = 800)
    @Column(name = "consulta1")
    private String consulta1;
    @Size(max = 800)
    @Column(name = "consulta2")
    private String consulta2;
    @Size(max = 800)
    @Column(name = "consulta3")
    private String consulta3;
    @Size(max = 800)
    @Column(name = "consulta4")
    private String consulta4;
    @Size(max = 800)
    @Column(name = "consulta5")
    private String consulta5;

    public Usuario() {
    }

    public Usuario(Integer id) {
        this.id = id;
    }

    public Usuario(Integer id, String usuario, String password, String nombre, String email) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.email = email;
    }

    //<editor-fold defaultstate="collapsed" desc="metodos get">
    public Integer getId() {
        return id;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public Integer getEdad() {
        return edad;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getSexo() {
        return sexo;
    }
    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setConsulta1(String consulta1) {
        this.consulta1 = consulta1;
    }

    public void setConsulta2(String consulta2) {
        this.consulta2 = consulta2;
    }

    public void setConsulta3(String consulta3) {
        this.consulta3 = consulta3;
    }

    public void setConsulta4(String consulta4) {
        this.consulta4 = consulta4;
    }

    public String getSensor() {
        return sensor;
    }

    public String getPin() {
        return pin;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getConsulta1() {
        return consulta1;
    }

    public String getConsulta2() {
        return consulta2;
    }

    public String getConsulta3() {
        return consulta3;
    }

    public String getConsulta4() {
        return consulta4;
    }

    public String getConsulta5() {
        return consulta5;
    }
    
    

//</editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="metodos set">
    public void setId(Integer id) {
        this.id = id;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="equal y hashcode">
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.usuario);
        hash = 79 * hash + Objects.hashCode(this.password);
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.email);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
        
    }
    
    
//</editor-fold>

    
    

  
    
}
