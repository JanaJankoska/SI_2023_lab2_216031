 2.
 
![CFG](https://github.com/JanaJankoska/SI_2023_lab2_216031/assets/108904154/4c3718e8-322c-4933-8bf5-497717b65abe)

 
3. 
Одговорот на ова прашање за цикломатската комплексност следи директно и од сликата поставена на прашање број 2. Цикломатска комлексност се пресметува како бројот на предикатни јазли + 1 или како бројот на ребра - бројот на јазли + 2 или како бројот на региони. Од сликата предикатните јазли се обоени со лилјакова боја, нивниот број е 10 + 1 = 11. Според втората формула имаме 32 ребра - 22 јазли + 2 = 11, а и според регионите јасно од сликата се гледа дека бројот на региони е 11 (означени со портокалова боја и нумерирани). Следи цикломатската комплексност е 11.

4. 
Имаме 5 тест случаи за да можат да се изминат сите ребра во графот. Првиот тест случај е: "user=null", со што се изминува Exception-от, односно рерата 1-2 и 2-23 и програмата завршува. Вториот тест случај е: "User: username=null, pass=jana, email=janajankoskagmail.com Users: username:Ime, pass:ime111, email:imeprez@gmail.com, username:janajankoska@gmail.com, pass:jana, email:janajankoska@gmail.com", со што се изминуваат ребрата 1-3, 3-4, 4-5,6, 5,6-14,15, 14,15-16, 16-23, каде со овој тест случај се влегува во вториот if каде се сетира username-от и се изминува шестиот If бидејќи password на user e < 8 и завршува програмата. Третиот тест случај е: "User: username=null, pass=jana111!@, email=janajankoska@gmail.com Users: username:Ime, pass:ime111, email:imeprez@gmail.com, username:janajankoska@gmail.com, pass:jana111!@, email:janajankoska@gmail.com", со што се изминуваат ребрата 1-3, 3-4, 4-5,6, 5,6-7,8.1, 7,8.1-8.2, 8.2-9,10, 8.2-14,15, 9,10-11, 11-12, 12-13, 13-8.3, 8.3-8.2, 14,15-17,18, 17,18-19.1, 19.1-19.2, 19.2-20, 20-21, 21-23. Дополнително со овој тест се изминуваат ребрата во првиот for каде се исполнети двата if услови, и се изминуваат ребрата од вториот for каде исто е исполнет if-от и програмата враќа return false. Четвртиот тест случај е: "User: username=null, pass=j ana111!@, email=janajankoska@gmail.com Users: username:Ime, pass:ime111, email:imeprez@gmail.com, username:janajankoska@gmail.com, pass:jana111!@, email:janajankoska@gmail.com", со што се изминуваат ребрата 1-3, 3-4, 4-5,6, 5,6-7,8.1, 7,8.1-8.2, 8.2-9,10, 8.2-14,15, 9,10-11, 11-12, 12-13, 13-8.3, 8.3-8.2, 14,15-17,18, 17,18-22, 22-23. Целта на овој тест е 8-иот if услов да не биде исолнет, со што програмата ќе премине на return false делот и ќе заврши. Петтиот тест случај и последниот е "User: username=janaaa, pass=jana11111, email=janajankoska@gmail.com Users: username:Ime, pass:ime111, email:imeprez@gmail.com, username:janaa@gmail.com, pass:jana111!@, email:jana@gmail.com" со што се изминуваат ребрата 1-3, 3-5,6, 5,6-7,8.1, 7,8.1-8.2, 8.2-9,10, 8.2-14,15, 9,10-12, 12-8.3, 8.3-8.2, 14,15-17,18, 17,18-19.1, 19.1-19.2, 19.2-22, 19.2-20, 20-19.3, 19.3-19.2, 22-23. Со овој тест се поминуваат ребрата каде вториот if услов не е исполнет, дополнително се поминуваат ребрата во привиот for каде if условите не се исполнети и ребрата од вториот for каде if-от не е исполнет па програмата преминува на return false и завршува. Така се изминати сите ребра со овие 5 тестови. 

![image](https://github.com/JanaJankoska/SI_2023_lab2_216031/assets/108904154/03f033e6-ebae-4056-8017-197b076c0513)


5. 
Имаме 4 тест случаи за да се опфатат сите комбинации во if-от. Првиот тест случај е "user=null",  па во if-от имаме TXX, бидејќи доволно е еден услов да е исполнет. Со овoј тест се изминуваат ребрата 1-2 и 2-23, односно Exception-от. Вториот тест случај е "user=jana pass=null", со што во if-от имаме FTX, со што повторно се изминуваат ребрата 1-2 и 2-23. Третиот тест случај е "user=jana pass=jana email=null", па во if-от имаме FFT, со што повторно се изминуваат ребрата 1-2 и 2-23. Последниот тест случај - 4 е "user=janaaa pass=jana111 email=janajankoska@gmail.com", каде во if-от имаме FFF, односно не е исполнет, па програмата не фрла Exception и се изминуваат ребрата 1-3, 3-5,6, 5,6-7,8.1, 8.1-8.2, 8.2-14,15, 14,15-16, 16-23 (една од можностите). 

![image](https://github.com/JanaJankoska/SI_2023_lab2_216031/assets/108904154/658837d1-a3b8-488d-a6e8-1ab7592050ee)


6. 
Користени се три видови на функции во двата тестови. Во првиот тест  assertEquals функцијата проверува дали излезот од програмата е ист со предвидениот излез. Оваа функција е користена и во вториот тест за предвидување на Exception. Функцијата assertNotEquals го проверува обратното од assertEquals, односно дека излезот на програмата не е предвидениот излез. Во првиот тест третата функција што се користи е assertFalse која што предвидува дека излезот од програмата врз основа на влезните параметри ќе врати false.
