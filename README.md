## AD_19_LiveData_ViewModel_DataBinding_App

### 📱 Short Description

A responsive counter application demonstrating the full integration of **LiveData, ViewModel, and Data Binding** to manage and display persistent, reactive data.

---

### 🧩 Concepts Covered

* **LiveData** (observable, lifecycle-aware data holder class)
* **Mutable Live Data** (modifiable LiveData)
* **ViewModel** (data persistence across configuration changes)
* **Data Binding** for linking UI elements directly to the ViewModel
* **Data Observation** via the `observe()` method

---

### 🎯 Learning / Discovery Points

* Converting mutable application variables (e.g., `counter`) into **`MutableLiveData<Int>`** for automatic UI updates.
* Updating LiveData values using the **`setValue()`** method.
* Setting up an **Observer** in the activity to listen for data changes from the ViewModel.
* Eliminating boilerplate code by using **Data Binding** to call ViewModel methods (`increaseCounter`) directly from the layout XML.
* Achieving automatic synchronization of the UI with the data source.

---

### ⚙️ App Features / Usage

* Displays a **numerical counter**.
* Button increments the counter.
* The counter value is **automatically updated** in the UI and **persists** when the screen is rotated (configuration change).

---

### 📝 Note

This application showcases how the three Jetpack components work together to provide a clean, reliable, and testable separation between the UI and the data.

---

### Screenshots
<table style="width:100%;"> 
  <tr> 
    <td align="center" style="width:50%;"> 
      <strong>Main Screen
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_19_LiveData_ViewModel_DataBinding_App/blob/main/Result%20Pics/01%20Main%20Screen.jpg" height="510" width="240"> 
  </td> 
    <td align="center" style="width:50%;"> 
      <strong>User Input
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_19_LiveData_ViewModel_DataBinding_App/blob/main/Result%20Pics/02%20User%20Input.jpg" height="510" width="240"> 
  </td> 
    <td align="center" style="width:50%;"> 
      <strong>Configuration changed & Data not lost
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_19_LiveData_ViewModel_DataBinding_App/blob/main/Result%20Pics/03%20Configuration%20changed%20%26%20Data%20not%20lost.jpg" height="510" width="480"> </td> </tr> </table>

<table style="width:100%;"> 
  <tr> 
    <td align="center" style="width:50%;"> 
      <strong>User Input
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_19_LiveData_ViewModel_DataBinding_App/blob/main/Result%20Pics/04%20User%20Input.jpg" height="510" width="480"> 
 </td> 
    <td align="center" style="width:50%;"> 
      <strong>Configuration changed & VM showing Live-Binded Data
        <br>
      </strong>
      <br> 
      <img src="https://github.com/MrHAM17/AD_19_LiveData_ViewModel_DataBinding_App/blob/main/Result%20Pics/05%20Configuration%20changed%20%26%20VM%20showing%20Live-Binded%20Data.jpg" height="510" width="240"> </td> </tr> </table>


---
