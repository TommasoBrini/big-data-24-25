package utils

object Config {

  // The local directory containing this repository
  val projectDir :String = "/C:/Users/tbrin/Desktop/tommi_uni/magistrale/2_1_BIGDATA/big-data-24-25"
  // THe name of your bucket on AWS S3
  val s3bucketName :String = "unibo-bd2425-tbrini"
  // The name of the shared bucket on AWS S3 to read datasets
  val s3sharedBucketName :String = "unibo-bd2425-egallinucci"
  // The path to the credentials file for AWS (if you follow instructions, this should not be updated)
  val credentialsPath :String = "/aws_credentials.txt"

}
