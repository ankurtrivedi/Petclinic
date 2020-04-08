// Exported from:        http://AnkurTrvedisMBP.fios-router.home:5516/#/templates/Foldercf72d11d46c240ed8e05f1bb30b40683-Release79e11b85eb3e40a9be15a61115583e1c/releasefile
// XL Release version:   8.5.3
// Date created:         Wed Apr 08 11:43:22 EDT 2020

xlr {
  template('Test') {
    folder('GBAM')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2019-03-07T09:00:00-0500')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}Z8wAwXMeR+1ORZMLt00zOdxCKkN/0dxnjKWeJEsAX3Q='
    phases {
      phase('New Phase') {
        tasks {
          manual('Test') {
            
          }
          manual('test') {
            
          }
        }
      }
    }
    
  }
}