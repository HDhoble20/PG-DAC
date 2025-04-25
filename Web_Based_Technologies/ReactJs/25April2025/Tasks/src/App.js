// import logo from './logo.svg';
import './App.css';
import FriendDetailComp from './components/FriendDetailComp';
import MyDetails from './components/MyDetails';

function App() {
  return (
    <div className="App">
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>  */}


      <MyDetails fname="Pawan" lname="Lekurwale" contact="9156115182" email="plpatil1151@gmail.com" address="At Post GalleBorgaon" /> 
     <FriendDetailComp />

    </div>
  );
}

export default App;
