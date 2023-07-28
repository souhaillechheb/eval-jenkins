# Use a base image with Tomcat installed (you can change the version if needed)
FROM tomcat:latest

# Copy the WAR file into the container's webapps directory
COPY target/*.war /opt/homebrew/Cellar/tomcat@9/9.0./libexec/webapps/souhail.war
