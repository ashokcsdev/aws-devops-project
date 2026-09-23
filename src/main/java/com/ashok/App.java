package com.ashok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String home() {
        return """
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>AWS DevOps Application</title>
            <style>
                * {
                    box-sizing: border-box;
                    margin: 0;
                    padding: 0;
                }

                body {
                    font-family: Arial, Helvetica, sans-serif;
                    background: #f4f7fb;
                    color: #172033;
                    min-height: 100vh;
                }

                .header {
                    background: #172554;
                    color: white;
                    padding: 22px 8%;
                    display: flex;
                    justify-content: space-between;
                    align-items: center;
                }

                .brand {
                    font-size: 22px;
                    font-weight: 700;
                }

                .status {
                    background: #16a34a;
                    padding: 8px 14px;
                    border-radius: 20px;
                    font-size: 13px;
                    font-weight: 600;
                }

                .hero {
                    max-width: 1100px;
                    margin: 70px auto 35px;
                    padding: 0 24px;
                    text-align: center;
                }

                .hero h1 {
                    font-size: 46px;
                    color: #172554;
                    margin-bottom: 18px;
                }

                .hero p {
                    font-size: 18px;
                    color: #64748b;
                    line-height: 1.7;
                    max-width: 760px;
                    margin: auto;
                }

                .badge {
                    display: inline-block;
                    margin-bottom: 22px;
                    padding: 7px 14px;
                    background: #dbeafe;
                    color: #1d4ed8;
                    border-radius: 20px;
                    font-size: 13px;
                    font-weight: 700;
                }

                .cards {
                    max-width: 1100px;
                    margin: 35px auto;
                    padding: 0 24px;
                    display: grid;
                    grid-template-columns: repeat(3, 1fr);
                    gap: 20px;
                }

                .card {
                    background: white;
                    border: 1px solid #e2e8f0;
                    border-radius: 14px;
                    padding: 28px;
                    box-shadow: 0 8px 25px rgba(15, 23, 42, 0.06);
                }

                .card h3 {
                    color: #172554;
                    margin-bottom: 10px;
                }

                .card p {
                    color: #64748b;
                    line-height: 1.6;
                    font-size: 14px;
                }

                .footer {
                    text-align: center;
                    padding: 35px 20px;
                    color: #64748b;
                    font-size: 13px;
                }

                @media (max-width: 800px) {
                    .cards {
                        grid-template-columns: 1fr;
                    }

                    .hero h1 {
                        font-size: 34px;
                    }

                    .header {
                        padding: 18px 5%;
                    }
                }
            </style>
        </head>
        <body>

            <header class="header">
                <div class="brand">AWS DevOps Project</div>
                <div class="status">● Application Running</div>
            </header>

            <section class="hero">
                <div class="badge">CLOUD • DEVOPS • KUBERNETES</div>
                <h1>AWS DevOps Application</h1>
                <p>
                    A containerized Spring Boot application deployed on
                    Amazon Elastic Kubernetes Service with an automated
                    Jenkins CI/CD pipeline and Amazon Elastic Container Registry.
                </p>
            </section>

            <section class="cards">
                <div class="card">
                    <h3>☁ AWS Infrastructure</h3>
                    <p>
                        Application infrastructure is provisioned and managed
                        using Terraform on AWS.
                    </p>
                </div>

                <div class="card">
                    <h3>⚙ CI/CD Pipeline</h3>
                    <p>
                        Jenkins automates build, package, container image
                        creation and Kubernetes deployment.
                    </p>
                </div>

                <div class="card">
                    <h3>☸ Kubernetes</h3>
                    <p>
                        The application runs on Amazon EKS with Kubernetes
                        deployment, service and health probes.
                    </p>
                </div>
            </section>

            <footer class="footer">
                AWS DevOps Portfolio Project • Spring Boot • Docker • Jenkins • EKS
            </footer>

        </body>
        </html>
        """;
    }
}
