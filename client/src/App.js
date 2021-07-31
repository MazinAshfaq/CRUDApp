import "./App.css";
import { useState } from "react"; 

function App() {
  const [Drivername, setDrivername] = useState("");
  const [Address, setAddress] = useState("");
  const [SS, setSS] = useState("");
  const [Phone, setPhone] = useState("");

  const displayInfo = () => {
    console.log(Drivername + Address + SS + Phone);
  };

  return (
    <div className="App"> 
      <div className="DriverInfo">
        <label for="name">Driver Name:</label>
        <input type="text" 
        onChange={(event) => {
          setDrivername(event.target.value);
        }}
        id="name" name="name" required/>
        <label for="address">Address: </label>
        <input type="text" 
        onChange={(event) => {
          setAddress(event.target.value);
        }}
        id="address" name="address" required/>
        <label for="SS#">SS#: </label>
        <input type="text"
        onChange={(event) => {
          setSS(event.target.value);
        }}
         id="SS#" name="SS#" required/>
        <label for="Phone#">Phone#: </label>
        <input type="text" onChange={(event) => {
          setPhone(event.target.value);
        }}
        id="Phone#" name="Phone#" required/>
        <button> Add Driver</button>
      </div>
    </div>
  );
}

export default App;
