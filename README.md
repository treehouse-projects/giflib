# gif.lib
This application is used in the Spring Basics Treehouse course. It is meant to be a Java student's first look at developing a web application using Java. The app itself will be a library of animated GIFs, along the lines of [giphy](http://giphy.com). It will have the following pages:
 
- Home page, listing all GIFs in the library
- Favorites page, listing all the GIFs that have been marked as a favorite
- Detail page for each GIF, showing the user that uploaded it and the date it was uploaded

What this app does:

- Serves dynamic web content according to URL, including index and detail pages
- Uses an underlying data source (static, Java data)
- Serves static assets, such as images, fonts, CSS, and JS

What this app does **NOT** do:

- Utilize dynamic data, such as a database
- Allow a user (web visitor) to alter underlying data, such as marking a GIF as a favorite or uploading a new GIF
- Implement user authentication