package reservations.classes;

// Projet Réservations M2L - version android
// fichier : src/reservation/classes/Salle.java
// Rôle : Il s'agit des salles qui vont être réservées
// Création : 06/12/2016 par PAQUET Thibault
// Mise à jour : 06/12/2016 par PAQUET Thibault

public class Salle
{
	// Membres Privés
	int _id;
	String _room_name;
	int _capacity;
	String _area_name;
	
	//constructeurs
	public Salle(int unId, String unRoomName, int uneCapacity, String unAreaName)
	{
		_id = unId;
		_room_name = unRoomName;
		_capacity = uneCapacity;
		_area_name = unAreaName;
	}

	// Getters and Setters
	public int getId() 
	{
		return _id;
	}

	public void setId(int unId) 
	{
		this._id = unId;
	}

	public String getRoomName() 
	{
		return _room_name;
	}

	public void setRoomName(String unRoomName) 
	{
		this._room_name = unRoomName;
	}

	public int getCapacity() 
	{
		return _capacity;
	}

	public void setCapacity(int uneCapacity) 
	{
		this._capacity = uneCapacity;
	}

	public String getAreaName() {
		return _area_name;
	}

	public void setAreaName(String unAreaName) 
	{
		this._area_name = unAreaName;
	}
	
	public String toString()
	{
		String msg;
		msg = "Salle : ";
		msg += "id : " + _id + "\n";
		msg += "room_name : " + _room_name + "<br>";
		msg += "capacity : " + _capacity + "<br>";
		msg += "area_name : " + _area_name + "<br>";
		
		return msg;
	}
}