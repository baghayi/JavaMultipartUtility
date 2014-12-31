Usage
====

`org.adeveloper.Multipart.Utility` class is the responsible for uploading specific photos for a givin resource.

For specifying any extra headers you will need to use `org.adeveloper.Multipart.Headers` class in order to add your own headers then pass is to Utility class by its `setHeaders` method.

If you open up Main.java class, you will see that all these classes are being instantiated and configured in there. Which is a great way of understanding how this library could be used.

#### Some tips in the `Main.java` class:

* In the `file` variable you need to specify a full path to your photo which is to be uploaded. like: /home/hossein/Pictures/experience-picture.png (In Unix based systems)

* Specify your resource URI in the `resourceUri` variable. Which request is to be send to.

* Replace `YOUR_ACCESS_TOKEN` with your access token. (If resource is not public)

* Finally replace `fieldName` variable value with whatever field name that is specified by your API providers. Which is our case is `photo`.