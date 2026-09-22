output "instance_id" {
  description = "EC2 instance ID"
  value       = aws_instance.devops_ec2.id
}

output "instance_type" {
  description = "EC2 instance type"
  value       = aws_instance.devops_ec2.instance_type
}

output "private_ip" {
  description = "Private IP address of the EC2 instance"
  value       = aws_instance.devops_ec2.private_ip
}

output "public_ip" {
  description = "Public IP address of the EC2 instance"
  value       = aws_instance.devops_ec2.public_ip
}

output "availability_zone" {
  description = "Availability Zone of the EC2 instance"
  value       = aws_instance.devops_ec2.availability_zone
}
