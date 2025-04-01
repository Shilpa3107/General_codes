import matplotlib.pyplot as plt
from sklearn.metrics import roc_curve, auc
import numpy as np

# Data from the table
tp_rates = np.array([0.920, 0.912, 0.881, 0.927, 0.917, 0.899])
fp_rates = np.array([0.022, 0.017, 0.018, 0.018, 0.017, 0.017])
classes = ["Reckless Driving", "Drunk Driving", "Weather Conditions", "Mechanical Failure", "Speeding", "Distracted Driving"]

# Calculate AUC (Area Under the ROC Curve)
roc_auc_values = []
for i in range(len(tp_rates)):
    fpr = np.array([0, fp_rates[i], 1])
    tpr = np.array([0, tp_rates[i], 1])
    roc_auc = auc(fpr, tpr)
    roc_auc_values.append(roc_auc)

# Plotting the ROC curve for each class
plt.figure(figsize=(10, 8))

for i in range(len(tp_rates)):
    plt.plot(fp_rates[i], tp_rates[i], marker='o', label=f'{classes[i]} (AUC = {roc_auc_values[i]:.3f})')
    plt.plot([0, 1], [0, 1], 'k--') # Diagonal line representing random guessing

plt.xlabel('False Positive Rate')
plt.ylabel('True Positive Rate')
plt.title('ROC Curve for Different Driving Factors')
plt.legend(loc='lower right')
plt.grid(True)
plt.show()

#Alternative way to plot the ROC curve.
plt.figure(figsize=(10, 8))

for i in range(len(tp_rates)):
    fpr = np.array([0, fp_rates[i], 1])
    tpr = np.array([0, tp_rates[i], 1])
    plt.plot(fpr, tpr, marker='o', label=f'{classes[i]} (AUC = {roc_auc_values[i]:.3f})')

plt.plot([0, 1], [0, 1], 'k--') # Diagonal line representing random guessing

plt.xlabel('False Positive Rate')
plt.ylabel('True Positive Rate')
plt.title('ROC Curve for Different Driving Factors')
plt.legend(loc='lower right')
plt.grid(True)
plt.show()