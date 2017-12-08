
package Classes;

/**
 *
 * @author Steve and Marcos
 */
public class Season {
    
    private String season_code;
    private String EntryDate;
    private String ExitDate;
    private String Name;

    public Season(String season_code, String EntryDate, String ExitDate, String Name) {
        this.season_code = season_code;
        this.EntryDate = EntryDate;
        this.ExitDate = ExitDate;
        this.Name = Name;
    }

    public String getSeason_code() {
        return season_code;
    }

    public void setSeason_code(String season_code) {
        this.season_code = season_code;
    }

    public String getEntryDate() {
        return EntryDate;
    }

    public void setEntryDate(String EntryDate) {
        this.EntryDate = EntryDate;
    }

    public String getExitDate() {
        return ExitDate;
    }

    public void setExitDate(String ExitDate) {
        this.ExitDate = ExitDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

   
    
}