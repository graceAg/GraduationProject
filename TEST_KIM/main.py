#%%
import librosa
import matplotlib.pyplot as plt

audio_path = 'testdata1.wav'

w, sr = librosa.load(audio_path)

print(plt.plot(audio_path[0:10]))
# %%
