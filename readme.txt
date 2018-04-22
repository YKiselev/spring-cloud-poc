
To create Config Service encryption key
keytool -genkeypair -alias mytestkey -keyalg RSA \
  -dname "CN=Web Server,OU=Unit,O=Organization,L=City,S=State,C=US" \
  -keypass changeme -keystore server.jks -storepass letmein

CS plain password: 123456

To encode password:
curl http://user:8b8737d2-b119-4a8c-aa80-b76de22905af@localhost:8888/encrypt -d 123456
curl -k https://user:123456@localhost:8443/encrypt -d 123456

Common configs.
You can share across all apps:
a) application.properties
b) application.yml
c) application-{profile}.properties
d) application-{profile}.yml

Health
http://localhost:8888/health
{"status":"UP"}

Props
http://localhost:8888/foo/dev -> http://localhost:8888/{application}/{profile}
JSON response

Or plain text
https://localhost:8443/foo/dev/master/foo.yml

To create SSL key
keytool -genkey -alias tomcat -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore keystore.p12 -validity 3650

To export certificate from keystore
keytool -export -keystore keystore.p12 -alias tomcat -file tomcat.cer

Import certificate to truststore
keytool -import -file tomcat.cer -alias tomcat -keystore truststore

Client config server password - plain or encrypted? Looks like needs key to decrypt.